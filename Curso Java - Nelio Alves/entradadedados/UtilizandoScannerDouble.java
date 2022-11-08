package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.printf("Você digitou: " + x);
        input.close();
    }
}
