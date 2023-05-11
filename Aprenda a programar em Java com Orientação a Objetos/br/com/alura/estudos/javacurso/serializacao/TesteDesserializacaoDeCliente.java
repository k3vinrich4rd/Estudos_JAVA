package br.com.alura.estudos.javacurso.serializacao;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacaoDeCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Client cliente = (Client) objectInputStream.readObject();
        System.out.println(cliente.getCpf());
        objectInputStream.close();
    }

}