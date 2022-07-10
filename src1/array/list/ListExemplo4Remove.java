package array.list;
// Utilizando ArrayList e o método clear (limpar) e add (adicionar)
import java.util.ArrayList;
import java.util.List;

public class ListExemplo4Remove {
    public static void main(String[] args) {
        // Declarando um ArrayList:
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Carlos Eduardo Candido");
        clientes.add("Marli Ribeiro");
        clientes.clear(); // clear (limpar) Remove todos os valores existentes em uma lista
        System.out.println(clientes.toString()); // to.String = volta os valores existentes na lista
    }
}
