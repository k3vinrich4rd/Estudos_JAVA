package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;

import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.ManagerComSobrecarga;

public class TestInstanceManagerComSobrecarga {
    public static void main(String[] args) {
        ManagerComSobrecarga kevin = new ManagerComSobrecarga();

        kevin.setName("Kevin Richard");
        kevin.setCpf("333.333.333-33");
        kevin.setSalary(100);

        System.out.println("Name: " + kevin.getName());
        System.out.println("Bonus salary: " + kevin.bonus());
        System.out.println("Cpf: " + kevin.getCpf());
        System.out.println("Salary: " + kevin.getSalary());

        kevin.setPassword(12345);
        kevin.setLogin("kevin");
        System.out.println(kevin.bonus());

        kevin.authenticated("kevin", 12345);

        System.out.println("\nSem login, somente senha");
        boolean authenticated = kevin.authenticated(12345);
        System.out.println(authenticated);
    }
}