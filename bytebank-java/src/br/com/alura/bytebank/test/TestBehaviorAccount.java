package br.com.alura.bytebank.test;

import br.com.alura.bytebank.exception.InsufficientBalanceException;
import br.com.alura.bytebank.template.Address;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;
import br.com.alura.bytebank.template.SavingsAccount;

public class TestBehaviorAccount {
    public static void main(String[] args) {

        Address address = new Address("Rua Tim Maia", 333,
                "Jd musical", "Osasco", "São paulo",
                "0000-000", "Casa");

        Client client = new Client("Kevin Richard", "000.000.000-00", address);

        SavingsAccount savingsAccount = new SavingsAccount(client, 0, 1, 2);
        CurrentAccount currentAccount = new CurrentAccount();

        System.out.println("Efetuando deposito");
        currentAccount.depositInAccount(1000);
        System.out.println("Balance in account " + currentAccount.getBalance() + "\n");

        System.out.println("Efetuando o saque na conta e tratando exception");
        try {
            currentAccount.toWithdraw(100000);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            System.out.println(insufficientBalanceException.getMessage() + "\n");
        }

        System.out.println("Efetuando a transferência: ");
        try {
            currentAccount.transfer(500, savingsAccount);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            System.out.println(insufficientBalanceException.getMessage());

        }

        System.out.println("Balance in account após a transferência: " + savingsAccount.getBalance());
    }

}