package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class TestAccounts {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        currentAccount.depositInAccount(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.depositInAccount(200.0);


        currentAccount.transfer(10.0, savingsAccount);
        System.out.println("Account Current: " + currentAccount.getBalance());
        System.out.println("Account Savings: " + savingsAccount.getBalance());


    }


}