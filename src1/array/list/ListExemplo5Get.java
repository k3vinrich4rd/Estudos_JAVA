package array.list;
// Utilizando ArrayList e o método get (pegar) e add (adicionar)
import java.util.ArrayList;

public class ListExemplo5Get {
    public static void main(String[] args) {
        // Declarando um ArrayList:
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Adalberto"); // add (adicionar) adiciona valores na lista
        clientes.add("Jhonatan Tavares"); // add (adicionar) adiciona valores na lista
        clientes.add("Paulo Renan "); // add (adicionar) adiciona valores na lista
        System.out.println(clientes.get(1)); // get (pegar) pegar os valores contidos na lista através de seus indices
    }
}
