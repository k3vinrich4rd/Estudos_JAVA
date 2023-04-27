package br.com.alura.estudos.javacurso.util.array;

public class ArrayObjectLiteral {
    public static void main(String[] args) {

        //Forma classica de criar um array:
        String[] nomes = new String[5];
        nomes[0] = "Lucas";
        nomes[1] = "Vinicius Junior";
        nomes[2] = "Rodrigo";
        nomes[3] = "Fábio";
        nomes[4] = "Igor";
        System.out.println(nomes[0]);

        //Forma object literal de criar um array:
        String[] names = {"Amanda", "Lucas", "Cleber"};
        System.out.println(names[0]);
    }
}
