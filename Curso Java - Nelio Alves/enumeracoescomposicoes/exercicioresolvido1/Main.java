package enumeracoescomposicoes.exercicioresolvido1;

import enumeracoescomposicoes.exercicioresolvido1.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Para receber o formatado de data
        //Digitado pelo usuário

        System.out.print("Enter department's name: "); // Digite o nome do departamento
        String departmentName = input.nextLine();
        System.out.println("Enter worker data: "); // Insira os dados do trabalhador:
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: "); //Nível
        String workerLevel = input.nextLine();
        System.out.print("Base salary: "); //Base salarial
        double baseSalary = input.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Department(departmentName)); //valueOf - para converter enum para String


        System.out.print("How many contracts to this worker? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data: "); //Digite os dados do contrato
            System.out.print("Date (DD/MM/YYYY): ");// Data
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per hour: "); // Valor por hora
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): "); //Duração
            int hours = input.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): "); //Enter month and year to calculate income
        String montAndYear = input.next();
        int month = Integer.parseInt(montAndYear.substring(0, 2));
        int year = Integer.parseInt(montAndYear.substring(3)); // Do indice três 'pra ferente'
        System.out.println("Name: " + worker.getName()); // Nome
        System.out.println("Department: " + worker.getDepartment().getName()); //Departamento
        System.out.println("Income for  " + montAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        input.close();
    }
}
