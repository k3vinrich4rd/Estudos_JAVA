package estruturacondicional;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite [M] - Matutino");
        System.out.println("Digite [V] - Vespertino");
        System.out.println("Digite [N] - Noturno\n");

        System.out.print("Em que turno você estuda?: ");
        String respostaDoUsuario = input.next();
        input.close();

        switch (respostaDoUsuario) {
            case "m":
            case "M":
            case "Matutino":
            case "matutino":

                System.out.println("Bom dia!");
                break;

            case "V":
            case "v":
            case "Vespertino":
            case "vespertino":
                System.out.println("Boa tarde");
                break;

            case "N":
            case "n":
            case "Noturno":
            case "noturno":
                System.out.println("Boa noite");
                break;

        }
    }
}
