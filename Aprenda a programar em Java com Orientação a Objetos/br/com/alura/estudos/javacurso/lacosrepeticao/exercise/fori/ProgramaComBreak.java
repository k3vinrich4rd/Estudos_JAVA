package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

public class ProgramaComBreak {
    public static void main(String[] args) {

        for (int linha = 1; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(coluna);
                System.out.print("");
            }
            System.out.println();
        }

    }
}