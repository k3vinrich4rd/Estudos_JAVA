package estruturadecondicao.exercicios;
import java.util.Scanner;
public class CalculadoraSalarioMinimo {
    // calculadora.Calculadora de salário minimo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");
        double salario = input.nextDouble();
        input.close();

        double salarioMinimo = 1212;
        double qtdSalarioMinimo = salario / salarioMinimo;

        System.out.printf("Você ganha %.1f de salários mínimos em 2022", qtdSalarioMinimo);
    }
}
