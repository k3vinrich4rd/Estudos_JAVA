package estruturadecondicao.exercicios;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        input.close();

        double imc = peso / (altura * altura);
        System.out.printf("Seu imc é: %.2f", imc);
    }
}
