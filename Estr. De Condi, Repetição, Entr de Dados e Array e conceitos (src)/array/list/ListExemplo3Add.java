package array.list;
// Utilizando ArrayList e o método ToString (para sequenciar) e add (adicionar)
import java.util.ArrayList;

public class ListExemplo3Add {
    public static void main(String[] args) {
        // Declarando um ArrayList:
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Kevin Richard"); // add (adicionar) adiciona valores na lista
        clientes.add("Ketelyn Mayara"); // add (adicionar) adiciona valores na lista
        System.out.println(clientes.toString()); // Retorna os valores existentes na lista

    }
}
