package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (do while):

import java.util.Scanner;

public class ContadorBasico3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDigitadas = "";
        int iadade = 0;
        int contadorSim = 0;

        System.out.print("Quer saber se você é menor ou maior de idade? [S]im / [N]ão: ");
        respostaDigitadas = entrada.next();
        if (respostaDigitadas.equalsIgnoreCase("s")) {
            contadorSim += 1;

        }
        do {
            if (respostaDigitadas.equalsIgnoreCase("s")) {
                System.out.print("Informe a sua idade: ");
                iadade = entrada.nextInt();
                if (iadade < 18) {
                    System.out.println("Você é menor de idade");
                } else {
                    System.out.println("Você é maior de idade");
                }
            } else {
                System.out.println("Ok, talvez outra hora");
                break;
            }
            System.out.print("Quer verificar mais alguma idade [S]im / [N]ão: ");
            respostaDigitadas = entrada.next();
            if (respostaDigitadas.equals("s")){
                contadorSim += 1;
            }
        } while (respostaDigitadas.equalsIgnoreCase("s"));
        System.out.println("Fechando o programa... ");
        System.out.println("Você fez a verificação de idades " + contadorSim + " vez(es)");


    }
}
