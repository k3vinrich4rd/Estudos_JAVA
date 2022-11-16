package poo.membrosestaticos.segundaversao;

import poo.membrosestaticos.segundaversao.util.Calculator;

import java.util.Scanner;

public class SegundaVersao {


    public static void main(String[] args) { //Função main (Por padrão é estático)
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = calculator.circumference(radius);

        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n" , c);
        System.out.printf("Volume: %.2f\n" , v);
        System.out.printf("PI value: %.2f\n" , calculator.PI);


        input.close();
    }

    /*
        Não podemos chamar um método que não estático dentro de um método estático,
        então na mesma classe não se pode chamar dentro de um método estático
        outros métodos que não sejam estáticos
     */

}
