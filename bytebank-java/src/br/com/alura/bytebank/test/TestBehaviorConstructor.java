package br.com.alura.bytebank.test;

import br.com.alura.bytebank.template.CurrentAccount;

public class TestBehaviorConstructor {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setNumber(-1);
        currentAccount.setAgency(-1);
    }
}