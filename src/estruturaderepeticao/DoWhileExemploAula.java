package estruturaderepeticao;

import java.util.Scanner;

// Declarando um Do (faça) While (enquanto):
// Executa pelo menos uma vez, mesmo se o operador for falso
public class DoWhileExemploAula {
    public static void main(String[] args) {

        int contadorSim = 0;
        boolean controlador = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Catalisa 4 é a melhor turma");
            System.out.print("Você deseja rodar novamente ? [1/2]: ");
            int opcao = input.nextInt();


            if (opcao == 1) {
                controlador = true;
            } else {
                controlador = false;
            }
        } while (controlador);
    }
}
