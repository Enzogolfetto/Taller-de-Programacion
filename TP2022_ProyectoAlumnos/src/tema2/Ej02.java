/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author enzo
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();           
        int DF=15;  int dimL=0; int cantidadPersonasMayores=0; 
        int dnimin=99999; int menorDNI=-1;
//no se como hacer porque esta intentando usar una referencia con valor nulo por lo que entiendo. 
        Persona [] vector = new Persona [DF];        
         int d; String nom; int e;
         e=GeneradorAleatorio.generarInt(99);
                        
            while ((dimL<DF) && (e!= 0) ) {
                nom=GeneradorAleatorio.generarString(10);
                d=GeneradorAleatorio.generarInt(1505);
                vector[dimL]= new Persona(nom,d,e);
                dimL++;
                e=GeneradorAleatorio.generarInt(99);
            
            }
            for(int j=0;j<dimL;j++)
                System.out.println(vector[j]);
           for (int i=0;i<dimL;i++){ //aca quiero recorrr el vector y calcular 
               if (vector[i].getEdad()>65){
                   cantidadPersonasMayores++;
               }
               if (vector[i].getDNI()< dnimin){
                   dnimin=vector[i].getDNI();
                   menorDNI=i;
               }
               
           }
                System.out.println("La cantidad de personas mayores a 65 es de: "+cantidadPersonasMayores);
                System.out.println ( "La persona con el menor DNI es: " + vector[menorDNI].toString());
    }
    
}
