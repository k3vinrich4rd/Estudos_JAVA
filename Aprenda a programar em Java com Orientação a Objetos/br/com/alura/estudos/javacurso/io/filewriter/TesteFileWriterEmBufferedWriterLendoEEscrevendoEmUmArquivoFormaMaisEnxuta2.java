package br.com.alura.estudos.javacurso.io.filewriter;

import java.io.IOException;
import java.io.PrintStream;

public class TesteFileWriterEmBufferedWriterLendoEEscrevendoEmUmArquivoFormaMaisEnxuta2 {
    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem4.txt"));

        //Utilizando PrintStream
        //É possível imprimir através dessa classe um fluxo binário
        //Utilizado antes de existir Reader e Writer
        PrintStream printStream = new PrintStream("lorem5.txt");
        printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printStream.println();
        printStream.println();
        printStream.println("Você vai conseguir Kevin");

       printStream.close();
    }
}