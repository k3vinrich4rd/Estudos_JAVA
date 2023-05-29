package br.com.alura.estudos.javacurso.set.exercise;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Luana alves");
        alunos.add("Jose Fumi");
        alunos.add("Rafael Santos Sousa");
        alunos.add("Felipe Silva");
        alunos.add("Pedro");
        alunos.add("Luis");

        //imprimindo com forEach (Method Reference)
        alunos.forEach(System.out::println);

        //Imprimindo o tamanho da coleção
        int sizeCollection = alunos.size();
        System.out.println("\nSize the list " + sizeCollection);

        //Adicionando um elemento repetido na lista
        alunos.add("Luana alves");

        //Verificando a lista novamente para analisar se teve alguma mudança no seu tamanho
        //Imprimindo o tamanho da coleção
        System.out.println("Size the list " + sizeCollection);

    }
}