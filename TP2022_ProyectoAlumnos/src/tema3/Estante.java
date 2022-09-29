/*
(i) devolver la cantidad de libros que almacenados ...
(ii) devolver si el estante está lleno....
(iii) agregar un libro al estante ..
(iv) devolver el libro con un título particular que se recibe PREGUNTAR!!!!
 */
package tema3;


public class Estante {
       private Libro [] libros; 
       private int dimF, dimL;


    public Estante() {
    }

    public Estante(int unaCantidad) {
        this.libros = new Libro[unaCantidad];
        this.dimF=unaCantidad;
        dimL = 0;
    }

    private Libro[] getLibros() {
        return libros;
    }

    private void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public int getDimL() {
        return dimL;
    }

    public String getCantidadLibros() {
       String aux;
       aux= ("La cantidad de libros almacenados es de "+(dimL+1));
       return (aux);
    }


    public void setDimL(int dimL) {
        this.dimL = dimL;
    }


    public boolean getEstalleno(){
        if(getDimL()== 20)
        return true;
        else
            return false;
    }
    public void agregarLibro(Libro l){
        if (getDimL() < getDimF()){
           System.out.println("Estoy 1111 1en Agregar libro"+dimL);

            libros[dimL]= l;//tengo un error aca creo que estoy guardando mal el libro en el estante en el programa principal
            System.out.println("Estoy en Agregar libro"+dimL);
            dimL++;
            
    }           
}
        public Autor getAutorLibro(String titulo){ //traer el autor de un libro
            int i=0; boolean encontre=false; Autor aux;
            aux= new Autor();
        while ((i < dimL) && (!encontre)) {
            if (libros[i].getTitulo().equals(titulo)){
                 encontre = true;
                 aux = libros[i].getPrimerAutor(); 
            }
        i++;
        }
        return (aux);
    } 
}