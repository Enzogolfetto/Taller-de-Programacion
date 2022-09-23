/*
5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author enzo
 */
public class Ej05 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int clientes=5;
        int aspectos=3;
        int i,j;
        int [][] tabla=new int [clientes][aspectos];
        GeneradorAleatorio.iniciar();
        
        for(i=0;i<clientes;i++){
            for(j=0;j<aspectos;j++){
                tabla[i][j]=0;
            }
        }
        for(i=0;i<clientes;i++){
            for(j=0;j<aspectos;j++){
                tabla[i][j]= GeneradorAleatorio.generarInt(9)+1;
            }
        }
         System.out.println("Imprimir Matriz");
         for (i=0;i<clientes;i++){
            System.out.println("Cliente numero "+i);
             for(j=0;j<aspectos;j++){
             System.out.print( tabla [i][j]+" ");
             }
             System.out.println();
         }
         System.out.println();
         
        int totalcolumna=0;
        int [] vector=new int [aspectos];
        System.out.println(" ");
        for(j=0;j<aspectos;j++){
            for (i=0;i<clientes;i++){
                totalcolumna += tabla[i][j];
                vector[j]=totalcolumna;
             }
              System.out.print( +vector [j]+" ");
              totalcolumna=0;
         }
        System.out.println(" ");
        double promedio;
        for (j=0;j<aspectos;j++){
            promedio=0;
            promedio=(double)vector[j]/aspectos;//es clave agregar el (double)para que trabaje con reales.
            System.out.println("El promedio del aspecto "+(j+1)+" es "+promedio);
            System.out.println(" ");
        }
     
    }
    
}
