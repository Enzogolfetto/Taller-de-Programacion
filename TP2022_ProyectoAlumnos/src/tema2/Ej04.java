/*
4- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author enzo
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hacer una tabla de [5] filas [8] columnas que guarde objetos
         GeneradorAleatorio.iniciar();
        int DFisicaFilas=5;  int DFisicaColumnas=8; int e,d; String nom;
        int dimLF=0; int dimLC=0; int i=0; int j=0;
        Persona [][] tabla = new Persona [DFisicaFilas][DFisicaColumnas];
         
         nom=GeneradorAleatorio.generarString(3);  
         while ((dimLF<DFisicaFilas) && (nom!="ZZZ")){
            dimLC=0;
             while((dimLC<DFisicaColumnas)&& (nom!="ZZZ")){
                e=GeneradorAleatorio.generarInt(5);        
                d=GeneradorAleatorio.generarInt(10000);
                tabla[dimLF][dimLC]= new Persona (nom,d,e);
                dimLC++;
                nom=GeneradorAleatorio.generarString(10);  
             }
             dimLF++;

             nom=GeneradorAleatorio.generarString(10);  
         }
        for (i=0;i<dimLF;i++){//se queda solo en el for de J
            for(j=0;j<dimLC;j++){
            System.out.println ( "Persona con turno el dia "+(i+1)+ " turno: "+(j+1)+" " + tabla [i][j].toString1());
            }
             System.out.println();
         }
         }
    }
    
