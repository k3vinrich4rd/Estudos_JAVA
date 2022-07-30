package lendodadosdoteclado;

import java.util.Scanner;

public class Exemplo2 {
    //Para ler um valor especifico diretamente do teclado:
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("Você digitou o número: " + numero);

        //Para pegar apenas a primeira palavra:
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = input.next();
        System.out.print("Seu primeiro nome é: " + primeiroNome);

    }
}
