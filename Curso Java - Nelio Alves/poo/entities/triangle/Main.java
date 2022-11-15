package poo.entities.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaTriangleX = x.area();
        double areaTriangleY = y.area();

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

