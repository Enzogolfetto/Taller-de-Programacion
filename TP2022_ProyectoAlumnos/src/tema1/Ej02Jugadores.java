/* 2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java*/
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;
public class Ej02Jugadores {

    
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double jugador;
        //Paso 3: Crear el vector para 15 double 
        int DF=3;
        double [] vector = new double [DF];
        //Paso 4: Declarar indice y variables auxiliares a usar
        int i;
        int cant=0;
        double promedio;
        double sumatotal=0;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0;i<DF;i++) {
             System.out.println("Ingrese jugador");
             jugador = Lector.leerDouble();
             vector[i]=jugador;
             sumatotal= sumatotal +jugador;
        }
        //Paso 7: Calcular1.71 el promedio de alturas, informarlo
        promedio= sumatotal/DF;
        System.out.println("La altura promedio es "+ (sumatotal/DF) );
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i=0;i<DF;i++){
            if (vector[i] > promedio)
                cant ++;
        }
        //Paso 9: Informar la cantidad.
        System.out.println("La cantidad de alturas superior al promedio es de "+cant);
    }
    
}
