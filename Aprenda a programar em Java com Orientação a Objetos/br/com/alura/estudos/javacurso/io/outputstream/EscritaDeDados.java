package br.com.alura.estudos.javacurso.io.outputstream;

import java.io.*;

public class EscritaDeDados {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        //bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Você vai conseguir Kevin");
        bufferedWriter.close();
    }
}