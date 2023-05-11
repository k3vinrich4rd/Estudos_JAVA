package br.com.alura.estudos.javacurso.methodreference.animes;

public class Anime {

    private String title;
    private int episodes;

    public Anime() {

    }

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareToIgnoreCase(anime2.getTitle());
    }

    public int compareByTitleNaoEstatico(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareToIgnoreCase(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByEpisodesNaoEstatico(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public String getTitle() {
        return this.title;
    }

    public int getEpisodes() {
        return this.episodes;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}