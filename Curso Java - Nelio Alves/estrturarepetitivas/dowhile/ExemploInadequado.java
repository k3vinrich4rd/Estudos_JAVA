package estrturarepetitivas.dowhile;
//Maneira inadequada
import java.util.Scanner;

public class ExemploInadequado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double c = input.nextDouble();
        double f = 9.0 * c / 5.0 + 32;
        System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
        System.out.print("Deseja repetir (s/n)? ");
        char resp = input.next().charAt(0);
        input.close();

        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");
            c = input.nextDouble();
            f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f", f);
            System.out.print("Deseja repetir (s/n)? ");
            resp = input.next().charAt(0);
        }
    }


}
