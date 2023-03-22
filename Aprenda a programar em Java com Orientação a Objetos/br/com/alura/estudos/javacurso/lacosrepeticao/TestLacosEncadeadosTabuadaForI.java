package br.com.alura.estudos.javacurso.lacosrepeticao;

public class TestLacosEncadeadosTabuadaForI {
    public static void main(String[] args) {

        for (int multiple = 1; multiple <= 10; multiple++) {
            for (int count = 0; count <= 10; count++) {
                System.out.print(multiple * count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}