package array.list;

import java.util.ArrayList;
import java.util.List;

//Aprendendo como executar uma lista:
public class ListaTreino {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Kevin");
        listaDeNomes.add("Juliano");

        System.out.println(listaDeNomes.size());
    }
}
