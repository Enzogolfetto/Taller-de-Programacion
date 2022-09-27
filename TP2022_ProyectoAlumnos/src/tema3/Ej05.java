/*
5-A- Definir una clase para representar círculos. Los círculos se caracterizan por su radio
(double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
Calcular el perímetro y devolverlo (método calcularPerimetro)
Calcular el área y devolverla
(método calcularArea)
B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área.
NOTA: la constante PI es Math.PI
 */
package tema3;
import PaqueteLectura.Lector;

public class Ej05 {


    public static void main(String[] args) {

        System.out.println("Igresar radio ");
        double r1 = Lector.leerDouble();
        System.out.println("Igresar Color relleno ");
        String colorR = Lector.leerString();
        System.out.println("Igresar Color linea ");
        String colorL = Lector.leerString();

        Circulo c = new Circulo(r1, colorR,colorL);
        System.out.println("El perimetro del Circulo es " + c.calcularPerimetro());
        System.out.println(" El area del Circulo es " + c.calcularArea());
    }
    
}
