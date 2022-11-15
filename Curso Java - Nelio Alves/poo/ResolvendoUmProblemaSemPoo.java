package poo;
//Calculando a area dos triângulos e mostrando a maior area
import java.util.Scanner;

public class ResolvendoUmProblemaSemPoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        double xA = input.nextDouble();
        double xB = input.nextDouble();
        double xC = input.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        double yA = input.nextDouble();
        double yB = input.nextDouble();
        double yC = input.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaTriangleX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));


        p = (yA + yB + yC) / 2.0;
        double areaTriangleY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f\n", areaTriangleX);
        System.out.printf("Triangle Y area: %.4f\n", areaTriangleY);

        if (areaTriangleX > areaTriangleY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }


        input.close();
    }
}
