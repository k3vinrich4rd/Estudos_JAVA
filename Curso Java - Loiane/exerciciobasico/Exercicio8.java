package exerciciobasico;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o seu valor hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadasNoMes = input.nextDouble();
        input.close();

        double salario = horasTrabalhadasNoMes * valorHora;
        System.out.printf("O valor do seu salário é de: R$ %.0f por mês", salario);
    }
}
