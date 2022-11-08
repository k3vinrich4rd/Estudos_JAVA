package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Você digitou: " + x);
        input.close();
    }
}
