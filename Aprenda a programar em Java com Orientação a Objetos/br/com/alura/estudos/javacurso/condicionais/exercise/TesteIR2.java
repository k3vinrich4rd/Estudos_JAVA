package br.com.alura.estudos.javacurso.condicionais.exercise;

import java.util.Scanner;

public class TesteIR2 {
    public static void main(String[] args) {

        //De 1900.0 até 2800,0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
        //De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
        //De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salary = input.nextDouble();
        double ir;

        if (salary >= 1900.0 && salary <= 2800.0) {
            System.out.println("IR of 7.5%");
            System.out.println("Deduction amount: R$ 142");
            ir = (salary * 7.5) / 100;
            salary -= ir;
            System.out.println("Value after discount: " + salary);
        } else if (salary >= 2800.01 && salary <= 3751.0) {
            System.out.println("IR of 15%");
            System.out.println("Deduction amount: R$ 350");
            ir = (salary * 15) / 100;
            salary -= ir;
            System.out.println("Value after discount: " + salary);
        } else {
            System.out.println("IR of 22.5%");
            System.out.println("Deduction amount: R$ 636");
            ir = (salary * 22.5) / 100;
            salary -= ir;
            System.out.println("Value after discount: " + salary);
        }

    }
}

