package array.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaDeNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Kevin");
        nomes.add("Ketelyn");
        nomes.add("Vilma");
        nomes.add("Eduardo");

        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
