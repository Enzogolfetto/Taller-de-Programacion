/*
 1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
 tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
 Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
 Provea métodos para:
 Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
 Calcular el perímetro y devolverlo (método calcularPerimetro)
 Calcular el área y devolverla (método calcularArea)

 B- Realizar un programa que instancie un triángulo, le cargue información leída desde
 teclado e informe en consola el perímetro y el área.
 NOTA: Calcular el área con la fórmula Área = √s(s − a)(s − b)(s − c) , donde a, b y c son
 los lados y s =
 a+b+c
 . La función raíz cuadrada es Math.sqrt(#)
 */
package tema3;

import PaqueteLectura.Lector;

public class Ej01 {

    public static void main(String[] args) {

        System.out.println("Igresar lado1 ");
        double l1 = Lector.leerDouble();
        System.out.println("Igresar lado2 ");
        double l2 = Lector.leerDouble();
        System.out.println("Igresar lado3 ");
        double l3 = Lector.leerDouble();
        System.out.println("Igresar Color de relleno ");
        String colorR = Lector.leerString();
        System.out.println("Igresar Color de Linea ");
        String colorL = Lector.leerString();

        Triangulo t = new Triangulo(l1, l2, l3, colorR, colorL);
        System.out.println("El perimetro del Triangulo es " + t.calcularPerimetro());
        System.out.println(" El area del triangulo es " + t.calcularArea());
    }

}
