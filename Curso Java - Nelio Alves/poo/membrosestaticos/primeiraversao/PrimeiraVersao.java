package poo.membrosestaticos.primeiraversao;

import java.util.Scanner;

public class PrimeiraVersao {
    public static final double PI = 3.14159; //Constante

    public static void main(String[] args) { //Função main (Por padrão é estático)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f\n" , c);
        System.out.printf("Volume: %.2f\n" , v);
        System.out.printf("PI value: %.2f\n" , PI);


        input.close();
    }

    /*
        Não podemos chamar um método que não estático dentro de um método estático,
        então na mesma classe não se pode chamar dentro de um método estático
        outros métodos que não sejam estáticos
     */
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
