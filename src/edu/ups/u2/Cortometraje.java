package edu.ups.u2;

public class Cortometraje extends ContenidoAudiovisual {
    private int duracionMin;
    private String festival;

    public Cortometraje(String titulo, int anio, String genero, int duracionMin, String festival) {
        super(titulo, anio, genero);
        this.duracionMin = duracionMin;
        this.festival = festival;
    }

    @Override
    public String info() {
        return "Cortometraje: " + getTitulo() + " (" + getAnio() + "), " + getGenero()
                + " - " + duracionMin + " min, festival: " + (festival == null ? "N/A" : festival);
    }
}
