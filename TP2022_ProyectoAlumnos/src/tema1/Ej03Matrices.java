/*
3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej03Matrices {

    public static void main(String[] args) {
	    //Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
         int DF=5;
         int DC=5;
         int [][] tabla = new int [DF][DC];
         int i,j;
         for (i=0;i<DF;i++){
             for (j=0;j<DC;j++){
                 tabla[i][j]= GeneradorAleatorio.generarInt(5);
             }
         }
        //Paso 4. mostrar el contenido de la matriz en consola
         System.out.println("Imprimir Matriz");
         for (i=0;i<DF;i++){
             for(j=0;j<DC;j++){
                 System.out.print( tabla [i][j]+" ");
             }
             System.out.println();
         }
         System.out.println();
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
         int totalfila=0;
        System.out.println("Ingrese fila ");
        int fila = Lector.leerInt();	
         for (j=0;j<DC;j++)
             totalfila= totalfila + tabla[fila][j];
         System.out.println("El total de la fila "+fila+" es "+ totalfila);
    
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
         int [] vector = new int [DC];
         int totalcolumna=0;
         System.out.println();
         System.out.println("La suma de los elementos de las columnas es la siguiente ordenada por columna: ");
         for(j=0;j<DC;j++){
             for (i=0;i<DC;i++){
             totalcolumna= totalcolumna + tabla[i][j];
             vector[j]=totalcolumna;
             }
              System.out.print( +vector [j]+" ");
              totalcolumna=0;
         }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
         System.out.println(" ");
          System.out.println();
         System.out.println("Ingrese valor ");
        int valor = Lector.leerInt();	
        boolean encontre=false;
        i=0; j=0;
        while(encontre == false && i<DF ){
            while (encontre == false && j<DC){
                if (valor == tabla[i][j]){
                    encontre=true;
                    System.out.println("Lo encontre en la fila "+i+" columna "+ j);
                }
                j++;    
            }
            i++;                             
        }
        if (encontre == false){
            System.out.println("El valor "+valor+" no fue encontrado");
            }   

    }
}
