package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula3 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Digite a opção desejada (1 ou 2): ");
        int opcao2 = input2.nextInt();


        if (opcao2 == 1) {
            System.out.println("Sua opção foi número 1");
        } else if (opcao2 == 2) {

            System.out.println("Sua opção foi número 2");
        } else {
            System.out.println("Opção inválida, digite novamente.");
        }
    }
}
