package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;

import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.EmployeeTest;

public class TestInstanceEmployeeWithConditions {
    public static void main(String[] args) {
        EmployeeTest employeeTest1 = new EmployeeTest();
        System.out.println("Type employee: " + employeeTest1.getType());
        employeeTest1.setSalary(3000.0);
        System.out.println("Bonus Employee " + employeeTest1.bonus() + "\n");


        EmployeeTest employeeTest2 = new EmployeeTest();
        employeeTest2.setType(2);
        System.out.println("Type Employee: " + employeeTest2.getType());
        employeeTest2.setSalary(5000.0);
        System.out.println("Bonus Employee: " + employeeTest2.bonus());

    }
}