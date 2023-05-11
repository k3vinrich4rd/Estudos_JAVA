package br.com.alura.estudos.javacurso.serializacao;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoDeCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client cliente = new Client();
        cliente.setName("Kevin Richard");
        cliente.setCpf("00000000000");
        cliente.setProfession("Desenvolvedor");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(cliente);

        objectOutputStream.close();
    }

}