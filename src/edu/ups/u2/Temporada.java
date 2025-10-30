package edu.ups.u2;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private int anioEstreno;
    private final List<String> episodios = new ArrayList<>();

    public Temporada(int numero, int anioEstreno) {
        this.numero = numero;
        this.anioEstreno = anioEstreno;
    }

    public void agregarEpisodio(String titulo) {
        if (titulo != null && !titulo.isBlank()) episodios.add(titulo);
    }

    public int getCantidadEpisodios() { return episodios.size(); }

    @Override
    public String toString() { return "T" + numero + " (" + anioEstreno + ")"; }
}
