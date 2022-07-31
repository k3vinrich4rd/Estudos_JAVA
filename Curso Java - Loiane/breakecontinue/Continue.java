package breakecontinue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inicial para efetuar uma contagem: ");
        int numero = input.nextInt();
        System.out.print("Informe um número final para parar essa contagem: ");
        int numeroFinal = input.nextInt();

        for (int i = numero; i <= numeroFinal; ++i){
            if (i % 7 == 0 ){
                continue;
            }
            System.out.println("Valor de i é: " + i);
        }
    }
}
