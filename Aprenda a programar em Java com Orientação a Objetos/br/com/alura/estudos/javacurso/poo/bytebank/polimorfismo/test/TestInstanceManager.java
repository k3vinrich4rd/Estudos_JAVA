package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;

import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Authenticated;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Manager;

public class TestInstanceManager {
    public static void main(String[] args) {
        Manager kevin = new Manager();
        kevin.setName("Kevin Richard");
        kevin.setCpf("333.333.333-33");
        kevin.setSalary(100);

        System.out.println("Name: " + kevin.getName());
        System.out.println("Bonus salary: " + kevin.bonus());
        System.out.println("Cpf: " + kevin.getCpf());
        System.out.println("Salary: " + kevin.getSalary());

        kevin.setPassword(12345);
        System.out.println(kevin.bonus());

        boolean authenticated = kevin.authenticated(12345);
        System.out.println(authenticated);
        System.out.println();

        //Importante → É possível referenciar uma ‘interface’
        // na declaração de um variável para acessar um novo objeto
        // (Mas somente com objetos que essa ‘interface’ implementa (tem contrato))
        Authenticated referenceAuthenticated = new Manager();
        referenceAuthenticated.setPassword(123);
        boolean test = referenceAuthenticated.authenticated(123);
        System.out.println(test);
    }
}