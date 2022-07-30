package lendodadosdoteclado;

import java.util.Scanner;

public class Exemplo1 {

    public static void main (String[] args){
        // Para ler uma linha inteira:
        Scanner input = new Scanner (System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine();
        input.close();

        System.out.println("Seu nome completo é: " + nomeCompleto);

    }
}
