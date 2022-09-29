/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package tema3;
import PaqueteLectura.Lector;

public class Ej03 {


    public static void main(String[] args) {
        int cantidadTotal=2; int i=0;
        
        Estante e =new Estante(cantidadTotal); //prestar atencion en los objetos array inicializar la DIMF aca
        
        while (i<e.getDimF()){
            Libro l=new Libro();
            Autor a = new Autor();
            System.out.println("Ingresar libros al estante "+(e.getDimL()+1));
            System.out.println("Ingresar Titulo ");
            l.setTitulo(Lector.leerString()); 
            System.out.println("Ingresar Editorial ");
            l.setEditorial(Lector.leerString()); 
                System.out.println("Ingresar Nombre Autor "); //aqui ingreso los datos de la clase autor
                a.setNombre(Lector.leerString());
                System.out.println("Ingresar Biografia ");
                a.setBiografía(Lector.leerString()); 
                System.out.println("Ingresar Origen ");
                a.setOrigen(Lector.leerString());                
                l.setPrimerAutor(a); 
            System.out.println("Ingresar Año de Edicion ");//continuo con la clase libro
            l.setAñoEdicion(Lector.leerInt());
            System.out.println("Ingresar ISBN ");
            l.setISBN(Lector.leerString()); 
            System.out.println("Inafgresar Precio ");
            l.setPrecio(Lector.leerDouble()); 
            System.out.println(l.toString());
            e.agregarLibro(l);   //cargo todos los datos de la variable l que es el objeto libro en el estante.
            i++;
        }
 
        System.out.println("Ingrese titulo a buscar: ");
        System.out.println(e.getAutorLibro(Lector.leerString())); 
        
        }
    }
    

