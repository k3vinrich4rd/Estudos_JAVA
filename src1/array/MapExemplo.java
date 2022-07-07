package array;
// Declarando um map.:
import java.util.*; // Importa tudo que é da biblioteca util
// Declarando um map.:
public class MapExemplo {
    public static void main(String[] args) {
        // Sempre tem duas informações, onde a primeira informação sempre é única
        Map <String,Double> cardapio = new HashMap<>(); //  Aqui se informa o tipo da variável e o valor
        cardapio.put("Macarronada", 15.00); // put (coloque) adiciona coisas na lista que nem o add das listas
        cardapio.put("Bife a Rolê", 15.00);
        System.out.println(cardapio.get("Macarronada")); // o get do map, faz a busca pela chave

        Map<String,String> listaDeConvidados = new HashMap<>();
        listaDeConvidados.put("kevinrichardve@gmail.com", "Kevin Richard");
        listaDeConvidados.put("kevin.candido@zup.com.br", "Richard");
        // Não é possível duplicar a primeira informação, somente a segunda (Exemplo):
        listaDeConvidados.put("kevinrichardve@gmail.com", "Kevin Richard");
        // Mas é possível duplicar a segunda informação:
        listaDeConvidados.put("kevingatinho@gmail.com", "Kevin Richard"); // Tem relação chave e valor

        System.out.println(listaDeConvidados.get("kevinrichardve@gmail.com")); // o get do map, faz a busca pela chave
        System.out.println(listaDeConvidados.containsValue("Kevin Richard"));
        // Faz busca se na sua variavel realmente tem aquele valor e retorna um valor boolean (True or False)


        // O map. É mais usado quando se precisa den duas informações e uma delas não pode repetir
        // como em:
        /*
        Lista de convidados
        Lista de chamada
        Cpf
         */

    }
}
