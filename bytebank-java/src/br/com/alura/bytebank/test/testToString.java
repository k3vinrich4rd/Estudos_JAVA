package br.com.alura.bytebank.test;

import br.com.alura.bytebank.template.CurrentAccount;
import br.com.alura.bytebank.template.SavingsAccount;

public class testToString {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.depositInAccount(100);
        System.out.println(currentAccount);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.depositInAccount(100);
        System.out.println(savingsAccount);
    }
}