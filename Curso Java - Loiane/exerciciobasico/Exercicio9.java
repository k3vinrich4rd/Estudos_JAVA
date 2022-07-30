package exerciciobasico;

import java.util.Scanner;

public class Exercicio9 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temperaturaEmFahrenheit = input.nextDouble();
        input.close();

        double temperaturaEmCelsius = (5 * (temperaturaEmFahrenheit - 32) / 9);
        System.out.printf("A temperatura informada em %.2f F é igual a ºC %.2f", temperaturaEmFahrenheit, temperaturaEmCelsius);
    }
}
