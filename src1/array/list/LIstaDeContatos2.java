package array.exercicios;

import java.util.ArrayList;

public class LIstaDeContatos2 {
    public static void main(String[] args) {
        ArrayList<String> listaDeContatos = new ArrayList<>();
        listaDeContatos.add("Kevin Richard");
        listaDeContatos.add("João");
        listaDeContatos.add("Vilma Regiane");
        listaDeContatos.add("Carlos eduardo");

        // : (em)
        for (String contatos : listaDeContatos) {
            System.out.println(contatos);

        }
    }
}
