package edu.ups.u2;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() { return nombre + " - " + especialidad; }
}
