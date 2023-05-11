package br.com.alura.estudos.javacurso.methodreference.animes;

import java.util.function.BiFunction;

//Utilizando métodos references com constructor com parâmetro
public class MethodReferenceTest05 {
    public static void main(String[] args) {

        //Criando um objeto sem method reference:
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        Anime anime = animeBiFunction.apply("Naruto", 666);
        System.out.println(anime);
        System.out.println();

        //Criando um objeto com method reference:
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;
        System.out.println(animeBiFunction1.apply("Super Onze", 656));

    }
}