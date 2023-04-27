package br.com.alura.estudos.javacurso.poo.bytebank.examples;


import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

public class ReferenceAndObject {
    public static void main(String[] args) {
        CurrentAccount firstAccount = new CurrentAccount();
        firstAccount.depositInAccount(300);
        System.out.println("Balance in first account: " + firstAccount.getBalance());
        System.out.println();

        //Estão se referenciando para o mesmo endereço de memória (Objeto equivalentes)
        Account secondAccount = firstAccount;
        System.out.println("Balance in second account: " + secondAccount.getBalance());
        secondAccount.depositInAccount(100);
        System.out.println("Balance in second account: " + secondAccount.getBalance() + "\n");
        System.out.println("Balance in first account: " + firstAccount.getBalance() + "\n");


        //Prova desse fato
        if (firstAccount == secondAccount) {
            System.out.println("A referência de memória é a mesma");
        } else {
            System.out.println("Você ganhou na mega sena");
        }


        System.out.println(firstAccount);

    }
}