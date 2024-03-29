package br.com.alura.estudos.javacurso.io.outputstream.printwriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestePrintWriterComFile {
    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem4.txt"));

        //Utilizando PrintStream
        //� poss�vel imprimir atrav�s dessa classe um fluxo bin�rio
        //Utilizado antes de existir Reader e Writer
        PrintStream printStream = new PrintStream(new File("lorem8.txt"), StandardCharsets.UTF_8);
        printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printStream.println();
        printStream.println();
        printStream.println("Voc� vai conseguir Kevin");

       printStream.close();
    }
}