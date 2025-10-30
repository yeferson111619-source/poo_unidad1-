package edu.ups.u2;

public class MainPruebas {
    public static void main(String[] args) {
        // Película + Actores (AGREGACIÓN)
        Pelicula p = new Pelicula("Inception", 2010, "Sci-Fi");
        p.agregarActor(new Actor("Leonardo DiCaprio", 1974, "EEUU"));
        p.agregarActor(new Actor("Joseph Gordon-Levitt", 1981, "EEUU"));
        System.out.println(p.info());

        // Serie + Temporadas (COMPOSICIÓN)
        SerieDeTV s = new SerieDeTV("Dark", 2017, "Misterio");
        var t1 = s.crearTemporada(1, 2017);
        t1.agregarEpisodio("Secretos"); t1.agregarEpisodio("Mentiras");
        var t2 = s.crearTemporada(2, 2019);
        t2.agregarEpisodio("Principios y finales");
        System.out.println(s.info());

        // Documental + Investigador (ASOCIACIÓN)
        Documental d = new Documental("Planeta Azul", 2001, "Naturaleza");
        d.asignarInvestigador(new Investigador("Dr. Cousteau", "Oceanografía"));
        System.out.println(d.info());

        // Subclases
        Cortometraje c = new Cortometraje("La Jetée", 1962, "Sci-Fi", 28, "Trieste");
        System.out.println(c.info());

        VideoYouTube v = new VideoYouTube("POO en 15 minutos", 2024, "Educación",
                "DevEnEspañol", "https://youtu.be/xxxxx");
        v.darLike(); v.darLike();
        System.out.println(v.info());
    }
}
