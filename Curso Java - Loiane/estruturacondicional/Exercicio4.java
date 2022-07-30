package estruturacondicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma letra e saiba se é vogal ou consoante: ");
        String letra = input.next();
        input.close();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra informada que foi " + letra + " é vogal");
        }else {
            System.out.println("A letra informada que foi " + letra + " é consoante");
        }
    }
}
