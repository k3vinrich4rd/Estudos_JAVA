package br.com.alura.estudos.javacurso.methodreference.animes;

import java.util.ArrayList;
import java.util.List;

//Utilizando métodos references a métodos estáticos
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>((List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("JOJO", 500))));

        //Sem método reference exemplo1:
        animeList.sort((anime1, anime2) -> anime1.getTitle().compareToIgnoreCase(anime2.getTitle()));
        animeList.forEach(anime -> System.out.println(anime));
        System.out.println();

        //Sem método reference exemplo2:
        animeList.sort((anime1, anime2) -> Anime.compareByTitle(anime1, anime2));
        animeList.forEach((anime) -> System.out.println(anime));
        System.out.println();


        //Com method reference
        animeList.sort(Anime::compareByTitle);
        animeList.forEach(System.out::println);

        System.out.println();
        //Com method reference
        animeList.sort(Anime::compareByEpisodes);
        animeList.forEach(System.out::println);
    }
}