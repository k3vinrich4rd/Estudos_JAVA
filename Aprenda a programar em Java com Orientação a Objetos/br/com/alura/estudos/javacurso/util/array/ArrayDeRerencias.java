package br.com.alura.estudos.javacurso.util.array;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class ArrayDeRerencias {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];

        CurrentAccount currentAccount = new CurrentAccount(222, 222);
        accounts[0] = currentAccount;

        SavingsAccount savingsAccount = new SavingsAccount(333, 333);
        accounts[1] = savingsAccount;

        //esse trecho do código da erro, porque o compilador não olha
        // na instanciação do objeto, mas sim no array, e o tipo do array é Conta
        // ContaPoupança ref = contas[1];

        //Solução: fazer um cast. (Transformação) para conta poupança, pois é uma subclasse menos genérica
        //Exemplo:
        CurrentAccount ref = (CurrentAccount) accounts[0];
        System.out.println(currentAccount.getNumber());
        System.out.println(ref.getAgency());


    }

}
