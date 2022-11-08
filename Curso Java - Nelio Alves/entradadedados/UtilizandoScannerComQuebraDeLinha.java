package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerComQuebraDeLinha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.nextLine();
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        input.close();


    }
}
