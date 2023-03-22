package br.com.alura.estudos.javacurso.lacosrepeticao;

public class TestLacosEncadeadosTabuadaWhile {
    public static void main(String[] args) {

        int multiple = 1;
        int count = 0;

        while (multiple <= 10) {
            multiple++;
            while (count <= 10){
                System.out.print(multiple * count);
                System.out.print(" ");
                count++;
            }
        }
    }
}