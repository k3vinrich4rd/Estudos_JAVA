package br.com.alura.estudos.javacurso.poo.bytebank.test;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

public class TestCheckOutNegativeValues {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();

        //Fazendo um saque via método
        account.depositInAccount(100);
        System.out.println(account.checkOut(200)); //Retorna false
        System.out.println("Balance in account: " + account.getBalance());

        //Fazendo um saque via atribuição
        account.depositInAccount(101);
        System.out.println(account.getBalance());

        System.out.println("Account created: " + Account.getTotal());
    }
}