package br.com.alura.estudos.javacurso.methodreference.animes;

import java.util.ArrayList;
import java.util.List;

//Utilizando referência a métodos não estáticos
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        List<Anime> animeList = new ArrayList<>((List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("JOJO", 500))));

        //Sem método reference:
        animeList.sort((anime1, anime2) -> anime.compareByEpisodesNaoEstatico(anime1, anime2));
        animeList.forEach((animes) -> System.out.println(animes));
        System.out.println();

        //Com método reference:
        animeList.sort(anime::compareByEpisodesNaoEstatico);
        animeList.forEach(System.out::println);
    }

}