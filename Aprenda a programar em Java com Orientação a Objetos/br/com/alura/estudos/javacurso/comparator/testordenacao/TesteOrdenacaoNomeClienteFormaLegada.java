package br.com.alura.estudos.javacurso.comparator.testordenacao;

import br.com.alura.estudos.javacurso.comparator.TitularDaContaComparator;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoNomeClienteFormaLegada {
    public static void main(String[] args) {

        Account cc1 = new CurrentAccount(22, 33);
        Client clienteCC1 = new Client();
        clienteCC1.setName("Nico");
        cc1.setHolder(clienteCC1);
        cc1.depositInAccount(333.0);

        Account cc2 = new SavingsAccount(22, 44);
        Client clienteCC2 = new Client();
        clienteCC2.setName("Guilherme");
        cc2.setHolder(clienteCC2);
        cc2.depositInAccount(444.0);

        Account cc3 = new CurrentAccount(22, 11);
        Client clienteCC3 = new Client();
        clienteCC3.setName("Paulo");
        cc3.setHolder(clienteCC3);
        cc3.depositInAccount(111.0);

        Account cc4 = new SavingsAccount(22, 22);
        Client clienteCC4 = new Client();
        clienteCC4.setName("Ana");
        cc4.setHolder(clienteCC4);
        cc4.depositInAccount(222.0);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Sem o método de numeroDaContaComparator");
        for (Account list1 : lista) {
            System.out.println(list1 + ", " + list1.getHolder().getName());
        }
        System.out.println();

        //Forma antiga de ordenar uma lista
        Collections.sort(lista, new TitularDaContaComparator());


        System.out.println("Com o método de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }
    }
}