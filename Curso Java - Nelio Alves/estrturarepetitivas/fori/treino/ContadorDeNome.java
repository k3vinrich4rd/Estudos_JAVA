package estrturarepetitivas.fori.treino;

import java.util.Scanner;

public class ContadorDeNome {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Inform you name: ");
        String name = input.nextLine();
        System.out.print("Informe one number: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++){
            System.out.println(name);
        }
    }
}
