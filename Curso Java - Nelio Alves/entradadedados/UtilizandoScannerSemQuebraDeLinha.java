package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerSemQuebraDeLinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        int y = input.nextInt();
        double z = input.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        input.close();
    }
}
