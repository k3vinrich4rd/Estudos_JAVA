package estruturaderepeticao;
//Utilizando a estrutura de repetição (for)
import java.util.Scanner;

public class ForExemploAula {
    public static void main(String[] args) {
        int [] idades = {10, 20, 30}; // vetor/ array
        //Estrutura de repetição
        for (int i = 0; i < idades.length; i++) { // i = index
            // o i soma a variável de controle
            System.out.println(idades[i]);
            System.out.println("Estou na posição: " + i);

        }
    }
}
