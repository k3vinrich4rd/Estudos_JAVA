package br.com.alura.estudos.javacurso.comparator;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import java.util.Comparator;

public class TitularDaContaComparator implements Comparator<Account> {

    @Override
    public int compare(Account account1, Account account2) {
        String nomeTitularConta1 = account1.getHolder().getName();
        String nomeTitularConta2 = account2.getHolder().getName();
        return nomeTitularConta1.compareToIgnoreCase(nomeTitularConta2);
       /*
       Se for menor - Retornar -1
       Se for maior - Retorna 1
       Se for igual - Retorna 0
        */

    }
}