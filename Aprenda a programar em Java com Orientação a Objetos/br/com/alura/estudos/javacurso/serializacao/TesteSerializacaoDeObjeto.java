package br.com.alura.estudos.javacurso.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoDeObjeto {
    public static void main(String[] args) throws IOException {
        String name = "Kevin Richard";
        //Para transformar um objeto em fluxo de bits e bytes
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        objectOutputStream.writeObject(name);
        objectOutputStream.close();
    }
}