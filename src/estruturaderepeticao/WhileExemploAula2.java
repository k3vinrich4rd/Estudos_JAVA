package estruturaderepeticao;

import java.util.Scanner;

public class WhileExemploAula2 {
    public static void main(String[] args) {

        boolean controlador = true;
        int contadorSim = 0;
        while (controlador) {
            System.out.println("Hello World ");
            System.out.print("Você deseja continuar rodando? S/N: ");
            Scanner input = new Scanner(System.in);
            String opcao = input.next();
            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Fechando programa...");
                System.out.println("Você apertou o sim " + contadorSim + " vezes");
                controlador = false;

            }
            contadorSim++;



        }
    }
}
