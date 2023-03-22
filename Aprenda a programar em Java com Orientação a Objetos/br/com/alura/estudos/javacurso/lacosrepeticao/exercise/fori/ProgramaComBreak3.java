package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

public class ProgramaComBreak3 {
    public static void main(String[] args) {

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(coluna + 1);
            }
            System.out.println();

        }
    }
}