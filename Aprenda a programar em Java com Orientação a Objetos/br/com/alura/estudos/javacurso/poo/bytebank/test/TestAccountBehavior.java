package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class TestAccountBehavior {
    public static void main(String[] args) {
        CurrentAccount firstAccount = new CurrentAccount();
        SavingsAccount secondAccount = new SavingsAccount();

        firstAccount.depositInAccount(200);
        System.out.println("Balance in first account: " + firstAccount.getBalance());
        System.out.println(firstAccount.checkOut(20)); //Retorna true
        System.out.println("Balance in first account after check out: " + firstAccount.getBalance() + "\n");

        secondAccount.depositInAccount(200);
        System.out.println("Balance in second account: " + secondAccount.getBalance());
        System.out.println(secondAccount.transfer(100, firstAccount));//Retorna true
        System.out.println("Balance in second account: " + secondAccount.getBalance());
        System.out.println("Balance in first account after transference the balance: " + firstAccount.getBalance());

    }
}