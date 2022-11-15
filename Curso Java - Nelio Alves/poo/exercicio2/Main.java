package poo.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.print("\nEmployee: " + employee + "\n");
        System.out.print("\nWhich percentage to increase salary? ");
        double porcentagem = input.nextDouble();
        employee.increaseSalary(porcentagem);
        System.out.print("\nUpdate data: " + employee);
        input.close();
    }
}