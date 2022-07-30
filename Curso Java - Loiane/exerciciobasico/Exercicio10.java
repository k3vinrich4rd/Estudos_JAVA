package exerciciobasico;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double temperaturaEmGrausCelsius = input.nextDouble();
        input.close();

        double temperaturaEmFahrenheit = (temperaturaEmGrausCelsius * 1.8)  + 32;

        System.out.printf("A temperatura informada em %.2f ºC é igual a F %.2f",
               temperaturaEmGrausCelsius , temperaturaEmFahrenheit);
    }
}
