package estruturadecondicao.exercicios;

import java.util.Scanner;

public class AreaDosTriangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;
        System.out.println("Informe as medidas do triângulo X: ");
        xa = input.nextDouble();
        xb = input.nextDouble();
        xc = input.nextDouble();

        System.out.println("Informe as medidas do triângulo Y: ");
        ya = input.nextDouble();
        yb = input.nextDouble();
        yc = input.nextDouble();
        input.close();

        double p = (xa + xb + xc) / 2.0;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

         p = (ya + yb + yc) / 2.0;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.printf("A área do triângulo X é: %.4f\n", areaX);
        System.out.printf("A área do triângulo X é: %.4f\n ", areaY);

        if (areaX > areaY){
            System.out.println("A maior área é a do X");
        }else {
            System.out.println("\nA maior área é do Y");
        }
    }
}
