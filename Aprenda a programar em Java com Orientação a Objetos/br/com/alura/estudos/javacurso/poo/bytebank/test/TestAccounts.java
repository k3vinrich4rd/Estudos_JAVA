package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountCurrent;
import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountSavings;

public class TestAccounts {
    public static void main(String[] args) {
        AccountCurrent accountCurrent = new AccountCurrent(111, 111);
        accountCurrent.depositInAccount(100.0);

        AccountSavings accountSavings = new AccountSavings(222, 222);
        accountSavings.depositInAccount(200.0);


        accountCurrent.transfer(10.0, accountSavings);
        System.out.println("Account Current: " + accountCurrent.getBalance());
        System.out.println("Account Savings: " + accountSavings.getBalance());


    }


}