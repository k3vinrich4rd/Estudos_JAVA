package br.com.alura.estudos.javacurso.poo.bytebank.test;


import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class TestCreateAccount {
    public static void main(String[] args) {
        // new Account(); // Fazendo isso já se cria um espaço em memória
        CurrentAccount firstAccount = new CurrentAccount();

        firstAccount.depositInAccount(200);
        System.out.println(firstAccount.getBalance());

        //outra forma de atribui valores ao atributo
        firstAccount.depositInAccount(100);
        System.out.println("Balance in first account: " + firstAccount.getBalance());

        SavingsAccount secondAccount = new SavingsAccount();
        secondAccount.depositInAccount(50);
        System.out.println("Balance in second account: " + secondAccount.getBalance());

        //referencias de memória diferentes (Objetos Diferentes)

        if (firstAccount.equals(secondAccount)) {
            System.out.println("bla");
        } else {
            System.out.println("riaaa");
        }

    }
}