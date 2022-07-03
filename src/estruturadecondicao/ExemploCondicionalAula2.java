package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite (s)sim ou (n)não: ");
        String opcao = input.next();

        //equals (é igual a) verifica e compara se foi o que o usuário digitou para exibir uma mensagem
        // Ou fazer uma ação predeterminada
        if (opcao.equalsIgnoreCase("não")) {
            System.out.println("Sua opção foi não");
        } else if (opcao.equals("s")) {
            // O ignoreCase ignora se a letra é maiúscula ou minúscula, ele valida os dois
            System.out.println("Sua opção foi sim");
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }


    }
}
