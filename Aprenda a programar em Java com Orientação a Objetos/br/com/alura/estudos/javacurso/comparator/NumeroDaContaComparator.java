package br.com.alura.estudos.javacurso.comparator;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;

import java.util.Comparator;

public class NumeroDaContaComparator implements Comparator<Account> {

    @Override
    public int compare(Account account1, Account account2) {
        return Integer.compare(account1.getNumber(), account2.getNumber());

        //return conta1.getNumero() - conta2.getNumero(); //simplificando

        //para fazer a mesma coisa abaixo:
//        if (conta1.getNumero() < conta2.getNumero()) {
//            return -1; //Vai para a primeira posição
//        } else if (conta1.getNumero() > conta2.getNumero()) {
//            return 1; //Vai para a última posição
//        }
//        return 0; //Para número iguais

    }
}