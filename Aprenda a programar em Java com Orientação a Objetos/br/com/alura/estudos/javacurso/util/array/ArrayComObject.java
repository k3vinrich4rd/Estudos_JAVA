package br.com.alura.estudos.javacurso.util.array;

import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class ArrayComObject {
    public static void main(String[] args) {
        Object[] objectsReference = new Object[5];
        CurrentAccount contaCorrente = new CurrentAccount(111, 111);
        objectsReference[0] = contaCorrente;

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        objectsReference[1] = savingsAccount;

        //esse trecho do código da erro, porque o compilador não olha
        // na instanciação do objeto, mas sim no array, e o tipo do array é Object
        // ContaPoupança ref = objectsReference[1];

        //Solução: fazer um cast. (Transformação) para conta poupança, pois é uma subclasse menos genérica
        //E tem acesso ao comportamento getNumero
        //Exemplo:
        SavingsAccount ref = (SavingsAccount) objectsReference[1];
        System.out.println(savingsAccount.getNumber());
        System.out.println(ref.getNumber());
    }
}
