package br.com.alura.estudos.javacurso.io.outputstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteConceitualEscritaDeDadosComTryCatch {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Treino");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Casa");
            bufferedWriter.newLine();
            bufferedWriter.write("Layla");
            bufferedWriter.close();

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}