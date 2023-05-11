package br.com.alura.estudos.javacurso.io.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriterEmBufferedWriterLendoEEscrevendoEmUmArquivo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("lorem3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //Utilizando file Writer
        //Com fileWrite é possível escrever uma sequência de Strings
        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " + "\n");
        bufferedWriter.newLine();//Forma mais elegante de se fazer um \n
        bufferedWriter.write("Você vai conseguir Kevin");

        bufferedWriter.close();
    }
}
