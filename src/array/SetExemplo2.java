package array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExemplo2 {


    public static void main(String[] args) {
        Set<String> emails = new HashSet<>(); // Cria um identificador para informações não serem duplicadas
        emails.add("kevinrichardve@gmail.com");
        emails.add("kevin.candido@zup.com.br");
        emails.add("kevinrichardve@gmail.com");
        emails.add("kevin.candido@zup.com.br");


     String[] array = emails.toArray(new String[emails.size()]); // Verifica o tamanho da lista
        System.out.println(array[0]); // A busca é feita através de indices
        System.out.println(array[1]);  // A busca é feita através de indices
        System.out.println(array[2]);  // A busca é feita através de indices
    }
        }
