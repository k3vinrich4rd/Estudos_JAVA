package entradadedados;
// Declarando um char
import java.util.Scanner;
// Declarando uma variável do tipo char:
public class Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira letra do seu nome: ");
        // valor de entrada char
        char primeiraLetraDoNome = input.next().charAt(0); // charAt(0), pega somente a primeira letra
        input.close();

        System.out.print("A primeira letra do seu nome é: " + primeiraLetraDoNome);
    }
}
