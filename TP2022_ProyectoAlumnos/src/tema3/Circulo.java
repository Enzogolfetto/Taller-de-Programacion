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


public class Circulo {
    private double radio;
    private String relleno;
    private String clinea;

    public Circulo() {
    }

    public Circulo(double unRadio, String unRelleno, String UnaLinea) {
        radio = unRadio;
        relleno = unRelleno;
        clinea = UnaLinea;
    }

    public double getRadio() {
        return radio;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getClinea() {
        return clinea;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setClinea(String clinea) {
        this.clinea = clinea;
    }
    
    public double calcularPerimetro () {
        return (2*Math.PI*(getRadio()));
    }
    public double calcularArea () {
        double s;
        s=calcularPerimetro()/2;
        return (Math.PI*(getRadio()*getRadio()));
    }
      
}

