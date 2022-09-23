/*4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido. */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author enzo
 */
public class Ej04 {
    public static void main(String[] args) {
    int npisos, noficina, j;
    int pisos=8,oficinas=4;
    int i;
    int [][] tabla=new int [pisos] [oficinas];
    GeneradorAleatorio.iniciar();
    for (i=0;i<pisos;i++){
        for(j=0;j<oficinas;j++){
            tabla [i][j]=0;
        }
    }
        System.out.println("Ingrese Numero de piso ");
        npisos=GeneradorAleatorio.generarInt(8)+1;
        System.out.println(npisos);
        System.out.println("Ingrese Numero de oficina ");
        noficina=GeneradorAleatorio.generarInt(4);
        System.out.println(noficina); 
    while(npisos != 8){      
        tabla[npisos][noficina]++;
         System.out.println("Ingrese Numero de piso ");
        npisos=GeneradorAleatorio.generarInt(8)+1;
        System.out.println(npisos);
        System.out.println("Ingrese Numero de oficina ");
        noficina=GeneradorAleatorio.generarInt(4);
        System.out.println(noficina); 
}
    System.out.println("La cantidad de personas por piso es de: ");
    for (i=0;i<pisos;i++){
        for(j=0;j<oficinas;j++){
             System.out.print( tabla [i][j]+" ");
             }
             System.out.println();
         }
    
    
    
    
    }
}
