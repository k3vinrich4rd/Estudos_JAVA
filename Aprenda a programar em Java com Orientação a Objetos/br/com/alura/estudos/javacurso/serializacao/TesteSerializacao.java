package br.com.alura.estudos.javacurso.serializacao;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Client cliente = new Client();
        cliente.setName("Kevin");
        cliente.setProfession("Dev");
        cliente.setCpf("334234");

        CurrentAccount cc = new CurrentAccount(222, 333);
        cc.setHolder(cliente);
        cc.depositInAccount(222.4);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cc.bin "));
        objectOutputStream.writeObject(cc);
        objectOutputStream.close();
    }
}