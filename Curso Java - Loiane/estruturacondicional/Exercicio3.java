package estruturacondicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu sexo");
        System.out.println("[F] - Para feminino");
        System.out.println("[M] - Masculino");
        System.out.println("[NB] - Não binário");
        System.out.println("[O] - Outro\n");
        System.out.print("Digite um das opções acima: ");
        String respostaDoUsuario = input.next();


        if (respostaDoUsuario.equalsIgnoreCase("f")) {
            System.out.println("Feminino");

        }else if (respostaDoUsuario.equalsIgnoreCase("m")){
            System.out.print("Masculino");
        } else if (respostaDoUsuario.equalsIgnoreCase("nb")) {
            System.out.print("Não binário");
        } else if (respostaDoUsuario.equalsIgnoreCase("o")) {
            System.out.print("Outro");
        }else {
            System.out.print("Sexo inválido");
        }



    }
}