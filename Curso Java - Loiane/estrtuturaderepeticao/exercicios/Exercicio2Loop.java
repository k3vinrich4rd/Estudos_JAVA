package estrtuturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio2Loop {
    public static void main(String[] args) {
        boolean informacacaoValidas = false;
        String userLogin;
        String userSenha;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Informe seu login: ");
            userLogin = input.nextLine();
            System.out.print("Informe a sua senha: ");
            userSenha = input.nextLine();
            System.out.println();

            if (userLogin.equalsIgnoreCase(userSenha)) {
                System.out.print("Senha idêntica ao usuário, digite novamente\n");
            } else {
                informacacaoValidas = true;
                System.out.print("Senha e usuários validos");

            }
        } while (!informacacaoValidas);


    }
}
