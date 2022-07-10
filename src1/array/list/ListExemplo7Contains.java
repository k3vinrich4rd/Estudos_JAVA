package array.list;

import java.util.ArrayList;

//Utilizando ArrayList e seus métodos Contains (contém)
public class ListExemplo7Contains {
    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Felipe");
        clientes.add("Rafael");
        clientes.add("Pedro");
        System.out.println(clientes.contains("Felipe")); // Contains (contém)
        // verifica se tem um valor específico na lista, se tiver retorna true se não retorna false
    }
}
