package exerciciosestruturasdecondicao;
// Estrutura condicional composta, utilizando o if (se) e else (se não)
import java.util.Scanner;

public class ClassificacaoDeIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = entrada.nextInt();
        int idade = 2022 - anoDeNascimento;
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }else {
            System.out.print("Você é menor de idade");
        }
        System.out.println("Você tem: " + idade + " anos de idade");
    }
}
