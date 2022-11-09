package entradadedados.exerciciosestruturasequencial;

import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais

Fórmula da área: area = pi . raio2
Considere o valor de pi = 3.14159
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radiusOfACircle = input.nextDouble();
        double pi = 3.14159;
        double area = radiusOfACircle * radiusOfACircle * pi;

        System.out.printf("A área do circulo é igual a: %.4f", area);
        input.close();
    }
}
