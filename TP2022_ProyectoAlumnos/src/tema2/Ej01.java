/*
Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
muestre en consola la representación de ese objeto en formato String.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author enzo
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ( "Igresar nombre " );
        String nom = Lector.leerString();
        System.out.println ( "Igresar DNI " );
        int d = Lector.leerInt();
        System.out.println ( "Igresar edad " );
        int e = Lector.leerInt();
        
        Persona per1 = new Persona (nom, d, e);
        System.out.println ( "Mi nombre es " + per1.getNombre());
        System.out.println ( "Mi DNI es " + per1.getDNI());
        System.out.println ( "Mi EDAD es " + per1.getEdad());

        
}
}
