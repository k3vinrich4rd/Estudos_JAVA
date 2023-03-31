package br.com.alura.estudos.javacurso.poo.bytebank.test;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountSavings;

public class TestGetterAndSetter {
    public static void main(String[] args) {
        AccountSavings account = new AccountSavings();
        //Forma antiga; account.number = 1337;
        account.setNumber(1337);
        System.out.println("Number the account: " + account.getNumber());

        AccountSavings account2 = new AccountSavings();
        //Forma antiga; account.number = 1337;
        account2.setNumber(1337);
        System.out.println("Number the account: " + account2.getNumber());

        System.out.println(Account.getTotal());

        System.out.println("\nAccount created: " + Account.getTotal());
    }


}