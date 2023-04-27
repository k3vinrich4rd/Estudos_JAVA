package br.com.alura.estudos.javacurso.util.array;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class ArrayDeRerencias2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];

        CurrentAccount currentAccount = new CurrentAccount(222, 222);
        accounts[0] = currentAccount;
        currentAccount.depositInAccount(200);

        SavingsAccount savingsAccount = new SavingsAccount(333, 333);
        accounts[1] = savingsAccount;
        savingsAccount.depositInAccount(100);

        for (Account account : accounts) {
            System.out.println(account);
        }

    }

}
