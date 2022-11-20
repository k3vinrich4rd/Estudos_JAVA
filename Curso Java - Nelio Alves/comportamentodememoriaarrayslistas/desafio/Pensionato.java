package comportamentodememoriaarrayslistas.desafio;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rent[] room = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i + " :");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Room: ");
            int roomNumber = input.nextInt();
            room[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }

        input.close();

    }
}
