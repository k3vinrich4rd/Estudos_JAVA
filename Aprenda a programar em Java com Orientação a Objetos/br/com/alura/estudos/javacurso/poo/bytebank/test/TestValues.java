package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class TestValues {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(1337, 24226);
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());


    }
}