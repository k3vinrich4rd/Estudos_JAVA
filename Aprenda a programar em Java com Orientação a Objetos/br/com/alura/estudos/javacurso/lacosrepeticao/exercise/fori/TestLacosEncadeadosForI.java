package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

public class TestLacosEncadeadosForI {
    public static void main(String[] args) {

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}