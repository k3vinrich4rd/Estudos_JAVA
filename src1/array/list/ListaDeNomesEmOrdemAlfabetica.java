package array.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeNomesEmOrdemAlfabetica {
    // Utilizando Arraylist e seus métodos:
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Kevin"); //add (adicionar) itens na lista
        nomes.add("Ketelyn"); //add (adicionar) itens na lista
        nomes.add("Vilma"); //add (adicionar) itens na lista
        nomes.add("Eduardo"); //add (adicionar) itens na lista

        Collections.sort(nomes);
        // Coloca a lista em ordem alfabética
        for (String nome : nomes) { //ForEach
            System.out.println(nome);
        }
    }
}
