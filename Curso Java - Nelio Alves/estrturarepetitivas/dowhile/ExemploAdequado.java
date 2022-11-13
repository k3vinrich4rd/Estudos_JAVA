package estrturarepetitivas.dowhile;

import java.util.Scanner;

public class ExemploAdequado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            double c = input.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Fahrenheit equivalent: %.1f\n", f);
            System.out.print("\nDo you want to repeat (s/n)? ");
            resp = input.next().charAt(0);
        } while (resp != 'n');

        System.out.println("Thank very much");
        input.close();
    }
}
