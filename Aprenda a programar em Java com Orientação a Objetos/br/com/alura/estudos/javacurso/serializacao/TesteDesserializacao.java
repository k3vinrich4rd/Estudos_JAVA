package br.com.alura.estudos.javacurso.serializacao;

import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cc.bin"));
        CurrentAccount cc = (CurrentAccount) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(cc.getHolder());
        System.out.println(cc.getBalance());


    }
}