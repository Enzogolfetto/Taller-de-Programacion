package tema3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enzo
 */
public class Autor {
    String nombre;  
    String biografía;
    String origen;

    public Autor() {
    }


    public Autor(String unNombre, String unaBiografía, String unOrigen) {
        nombre = unNombre;
        biografía= unaBiografía;
        origen=unOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBiografía() {
        return biografía;
    }

    public String getOrigen() {
        return origen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBiografía(String biografía) {
        this.biografía = biografía;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Autor: " + "nombre= " + nombre + ", biografía= " + biografía + ", origen= " + origen;
    }
    
}
