package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicionalEncadeada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it?");
        int hours = input.nextInt();

        if (hours < 12) {
            System.out.println("Good Morning");
        } else {
            if (hours < 18) {
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Evening");
            }
        }
    }
}
