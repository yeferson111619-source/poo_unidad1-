package edu.ups.u2;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    // COMPOSICIÓN: la Serie "posee" sus Temporadas
    private final List<Temporada> temporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int anio, String genero) {
        super(titulo, anio, genero);
    }

    /** Crea y añade una temporada perteneciente a esta serie */
    public Temporada crearTemporada(int numero, int anioEstreno) {
        Temporada t = new Temporada(numero, anioEstreno);
        temporadas.add(t);
        return t;
    }

    public List<Temporada> getTemporadas() {
        return List.copyOf(temporadas);
    }

    public int getEpisodiosTotales() {
        return temporadas.stream().mapToInt(Temporada::getCantidadEpisodios).sum();
    }

    @Override
    public String info() {
        return "Serie: " + getTitulo() + " (" + getAnio() + ") - " + getGenero()
                + " | Temporadas: " + temporadas.size()
                + " | Episodios: " + getEpisodiosTotales();
    }
}
