package entradadedados.exerciciosestruturasequencial;

import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeNumber = input.nextInt();
        int hoursWorked = input.nextInt();
        double hourValue = input.nextDouble();

        double salary = hoursWorked * hourValue;

        System.out.println("NUMBER EMPLOYEE = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f ", salary);
        input.close();


    }
}
