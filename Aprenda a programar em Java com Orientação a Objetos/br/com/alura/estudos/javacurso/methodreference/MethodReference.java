package br.com.alura.estudos.javacurso.methodreference;

import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {

        ArrayList<CurrentAccount> list = new ArrayList<>();

        CurrentAccount currentAccount1 = new CurrentAccount(111, 111);
        list.add(currentAccount1);

        CurrentAccount currentAccount2 = new CurrentAccount(222, 222);
        list.add(currentAccount2);

        //Percorrendo com forEach
        //list.forEach(contaCorrente -> System.out.println(contaCorrente.toString(contaCorrente.getNumero(), contaCorrente.getAgencia())));

        //Método referência:
        list.forEach(CurrentAccount::getAgency);


        //Funciona apenas em ‘interfaces’ funcionais (Interfaces com apenas um método abstrato
        //Fazendo isso com a ‘interface’ Consumer:
        CurrentAccount currentAccount3 = new CurrentAccount(333, 333);
        Consumer<CurrentAccount> consumer = CurrentAccount::getNumber;
        consumer.accept(currentAccount3);

        //Fazendo a mesma coisa com uma ‘interface’ que não tem argumento
        Runnable runnable = currentAccount3::getNumber;
        runnable.run();
    }
}