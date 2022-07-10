package array.list;
// Utilizando Arraylist e seus métodos ToString (para sequenciar), remove(remove) e add (adiciona)
import java.util.ArrayList;
import java.util.Arrays;

public class ListExemplo2ToString {
    public static void main(String[] args) {
        // Declarando um ArrayList:
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Kevin Richard"); // add (adicionar) adiciona valores na lista
        clientes.add("Ketelyn Mayara"); // add (adicionar) adiciona valores na lista
        clientes.remove(1); // Remove os itens de uma lista (através do index)
        System.out.println(clientes.toString()); // Retorna os valores existentes na lista
    }
}
