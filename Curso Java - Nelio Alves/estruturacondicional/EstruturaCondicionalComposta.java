package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicionalComposta {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int hora = input.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }else {
            System.out.println("Boa tarde");
        }
    }
}
