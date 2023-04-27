package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;

public class TestInstanceAccountWithConstructor {
    public static void main(String[] args) {

        Client client = new Client("Kevin Richard",
                "111.111.111-11",
                "Developer Assistant");

        System.out.println("Name the client: " + client.getName());
        System.out.println("Cpf the client: " + client.getCpf());
        System.out.println("Profession the client: " + client.getProfession() + "\n");


        SavingsAccount account = new SavingsAccount(client,
                24226,
                1337,
                100);

        System.out.println("Balance the account: " + account.getBalance());
        System.out.println("Agency the account: " + account.getAgency());
        System.out.println("Number the account: " + account.getNumber());
        System.out.println("Holder the account: " + account.getHolder().getName());

        SavingsAccount account2 = new SavingsAccount(client,
                24226,
                14447,
                100);


        System.out.println("\nTotal account created " + Account.getTotal());
        System.out.println("Total client created " + Client.getClientsTotal());
    }
}