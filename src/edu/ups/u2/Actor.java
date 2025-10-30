package edu.ups.u2;

import java.util.Objects;

public class Actor {
    private String nombreArtistico;
    private int anioNacimiento;
    private String nacionalidad;

    public Actor(String nombreArtistico, int anioNacimiento, String nacionalidad) {
        this.nombreArtistico = nombreArtistico;
        this.anioNacimiento = anioNacimiento;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nombreArtistico + " (" + nacionalidad + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nombreArtistico, actor.nombreArtistico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreArtistico);
    }
}
