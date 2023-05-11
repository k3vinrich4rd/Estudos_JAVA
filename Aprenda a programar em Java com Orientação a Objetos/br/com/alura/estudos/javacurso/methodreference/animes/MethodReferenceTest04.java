package br.com.alura.estudos.javacurso.methodreference.animes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

//Utilizando métodos references com constructor sem parâmetro
public class MethodReferenceTest04 {
    public static void main(String[] args) {

        //Criando um objeto sem method reference:
        Supplier<Anime> animeSupplier1 = () -> new Anime();
        Anime anime1 = animeSupplier1.get();// Momento que o objeto está sendo criado
        //pois o get() retorna um novo objeto
        List<Anime> animeList1 = new ArrayList<>((List.of(new Anime("Berserk", 43), new Anime("One piece", 100), new Anime("JOJO", 500))));
        animeList1.sort((animes1, animes2) -> anime1.compareByEpisodesNaoEstatico(animes1, animes2));
        animeList1.forEach(animes -> System.out.println(animes));
        System.out.println();


        //Criando um objeto com method reference:
        Supplier<Anime> animeSupplier2 = Anime::new;
        Anime anime2 = animeSupplier2.get();
        List<Anime> animeList2 = new ArrayList<>((List.of(new Anime("Werserk", 43), new Anime("One piece", 100), new Anime("JOJO", 500))));
        animeList2.sort(anime2::compareByTitleNaoEstatico);
        animeList2.forEach(System.out::println);

    }
}