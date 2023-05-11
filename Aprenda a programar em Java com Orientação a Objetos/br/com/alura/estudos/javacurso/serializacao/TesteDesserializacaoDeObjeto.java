package br.com.alura.estudos.javacurso.serializacao;

import java.io.*;

public class TesteDesserializacaoDeObjeto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(nome);

    }

}