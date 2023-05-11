package br.com.alura.estudos.javacurso.io.outputstream.printwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TestePrintWriter {
    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem4.txt"));

        //Utilizando PrintStream
        //É possível imprimir através dessa classe um fluxo binário
        //Utilizado antes de existir Reader e Writer
        PrintWriter printStream = new PrintWriter("lorem7.txt", StandardCharsets.UTF_8);
        printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printStream.println();
        printStream.println();
        printStream.println("Você vai Kevin");

       printStream.close();
    }
}