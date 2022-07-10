package array.list;

import java.util.ArrayList;

// Utilizando ArrayList e seus métodos IndexOf (indice de) e add (adicionar)
public class ListExemplo9IndexOf {
    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pantera negra");
        clientes.add("Hancock");
        clientes.add("Lanterna Verde");
        System.out.println(clientes.indexOf("Pantera negra")); // Informa o indice da informação da sua lista
        System.out.println(clientes.indexOf("Hancock")); // Informa o indice da informação da sua lista
    }
}
