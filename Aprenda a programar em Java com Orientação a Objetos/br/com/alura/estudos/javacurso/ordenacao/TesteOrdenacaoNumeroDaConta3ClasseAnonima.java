package br.com.alura.estudos.javacurso.ordenacao;


import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoNumeroDaConta3ClasseAnonima {
    public static void main(String[] args) {

        Client cliente = new Client("Kevin Richard", "333.333.333-33");
        Client cliente2 = new Client("Abigail Richard", "333.333.333-33");

        Account cc1 = new CurrentAccount(22, 33);
        cc1.depositInAccount(333.0);
        cc1.setHolder(cliente);
        Account cc2 = new SavingsAccount(22, 44);
        cc2.depositInAccount(444.0);
        cc2.setHolder(cliente2);
        Account cc3 = new CurrentAccount(22, 11);
        cc3.depositInAccount(111.0);
        cc3.setHolder(cliente);
        Account cc4 = new SavingsAccount(22, 22);
        cc4.depositInAccount(222.0);
        cc4.setHolder(cliente);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Sem o método de numeroDaContaComparator");
        for (Account list : lista) {
            System.out.println(list);
        }
        System.out.println();

        //Classe anonima ? Utilizada quando temos uma classe que só é usada em um lugar
        //A classe anônima implementa a ‘interface’ e é compatível
        lista.sort(new Comparator<Account>() { //new instancia a classe

                       @Override
                       public int compare(Account conta1, Account conta2) {
                           return Integer.compare(conta1.getNumber(), conta2.getNumber());
                       }//fim da sobrescrita

                   } //Fim da classe anônima
        ); //Fim do método


        System.out.println("Com o método de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }

    }
}