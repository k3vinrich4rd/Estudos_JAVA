package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerChar {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        char x = input.next().charAt(0);
        System.out.println("você digitou: " + x);
        input.close();
    }
}
