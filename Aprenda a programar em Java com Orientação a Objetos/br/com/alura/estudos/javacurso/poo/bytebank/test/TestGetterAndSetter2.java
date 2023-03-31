package br.com.alura.estudos.javacurso.poo.bytebank.test;

import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountCurrent;
import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountSavings;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;

public class TestGetterAndSetter2 {
    public static void main(String[] args) {

        AccountCurrent account = new AccountCurrent();
        Client kevin = new Client();
        //Forma antiga: kevin.name = "Kevin Richard";
        //Atribuindo um nome:
        kevin.setName("Kevin Richard");
        account.setHolder(kevin);
        System.out.println("Holder the account: " + account.getHolder().getName());
        //mudando o nome:
        kevin.setName("Meire");
        System.out.println("Holder the account: " + account.getHolder().getName() + "\n");
        //Atribuindo uma profissão ao holder:
        account.getHolder().setProfession("Software Developer");
        System.out.println(account.getHolder().getProfession());
        //Fazendo a mesma coisa de forma diferente
        Client holderTheAccount = account.getHolder();
        holderTheAccount.setProfession("Junior Developer");
        System.out.println(holderTheAccount.getProfession());
        System.out.println(kevin.getProfession());
        System.out.println();


        AccountSavings accountKatia = new AccountSavings();
        Client katia = new Client();

        katia.setName("Kátia");
        katia.setProfession("Analista de dados");
        katia.setCpf("111.111.111-11");

        accountKatia.setHolder(katia);
        accountKatia.setNumber(4234);
        accountKatia.setAgency(542524);

        System.out.println(accountKatia.getHolder().getName());
        System.out.println(accountKatia.getHolder().getCpf());
        System.out.println(accountKatia.getHolder().getProfession());

        Client holderAccount = accountKatia.getHolder();
        holderAccount.setName("Larissa");
        System.out.println(holderAccount.getName());


    }
}