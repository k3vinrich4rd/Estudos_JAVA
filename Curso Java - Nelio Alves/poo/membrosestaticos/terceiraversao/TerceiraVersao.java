package poo.membrosestaticos.terceiraversao;

import poo.membrosestaticos.segundaversao.util.Calculator;
import poo.membrosestaticos.terceiraversao.util.Calculator2;

import java.util.Scanner;

public class TerceiraVersao {

    public static void main(String[] args) { //Função main (Por padrão é estático)
        Scanner input = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = Calculator2.circumference(radius);

        double v = Calculator2.volume(radius);

        System.out.printf("Circumference: %.2f\n" , c);
        System.out.printf("Volume: %.2f\n" , v);
        System.out.printf("PI value: %.2f\n" , Calculator2.PI);


        input.close();
    }
}
