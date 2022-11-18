package poo.exerciciodefixacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.print("\nAccount data: \n");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = input.nextDouble();
        account.deposit(deposit);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = input.nextDouble();
        account.withDraw(withdraw);

        System.out.println("Update account data:");
        System.out.println(account);

        input.close();


    }

}
