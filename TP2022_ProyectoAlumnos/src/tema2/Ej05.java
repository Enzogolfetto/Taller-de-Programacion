/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:

Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej05 {

    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        int DF=2; int dimL=0;
        Partido vector []= new Partido [DF];
        int i; int cantRiverGano=0; int totalgolesBocaLocal=0;
        
        String local,visitante; int GolLocal, GolVisitante;
        System.out.println("Ingresar Visitante");
         visitante=Lector.leerString(); 
                        
            while ((dimL<DF) && (visitante != "ZZZ") ) {
                System.out.println("Ingresar Local");
                local=Lector.leerString(); 
                GolLocal=GeneradorAleatorio.generarInt(5);
                GolVisitante=GeneradorAleatorio.generarInt(5);
                vector[dimL]= new Partido(local, visitante, GolLocal, GolVisitante);
                dimL++;
                System.out.println("Ingresar Visitante");
                visitante=Lector.leerString();      
    }
                    
           for(i=0;i<dimL;i++){
                System.out.println("Partido "+(i)+ " EQUIPO-LOCAL "+vector [i].getLocal()+"  "+vector [i].getGolesLocal()+" VS EQUIPO-VISITANTE "+vector [i].getVisitante()+"  "+vector [i].getGolesVisitante());
            }
           
           for(i=0;i<dimL;i++){
                if (vector [i].getGanador().equals("River")){
                   cantRiverGano++; 
                }
                if (vector [i].getLocal().equals("Boca")) {
                    totalgolesBocaLocal+= vector [i].getGolesLocal();
                }
            }
           System.out.println("River gano: "+cantRiverGano+" y Boca metio: "+totalgolesBocaLocal+" goles de local");
}
}

  
                    

    
