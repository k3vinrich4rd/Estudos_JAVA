package br.com.alura.bytebank.test;

import br.com.alura.bytebank.template.CurrentAccount;

public class TestString {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(111, 222);
        System.out.println(currentAccount.getAgency());
        System.out.println(currentAccount.getNumber() + "\n");
        currentAccount.setAgency(333);
        currentAccount.setNumber(444);
        System.out.println(currentAccount.getAgency());
        System.out.println(currentAccount.getNumber() + "\n");

        System.out.println("-------------------------------------------- " + "\n");

        //Impossível mudar o valor do objeto alocado em memória dessa maneira
        String name = "Kevin";
        name.replace('K', 'k');
        name.length();
        name.toLowerCase();
        name.toUpperCase();
        System.out.println(name);

        //Maneira correta:
        String nameMutable = name.replace('K', 'k');
        System.out.println(nameMutable);


    }
}