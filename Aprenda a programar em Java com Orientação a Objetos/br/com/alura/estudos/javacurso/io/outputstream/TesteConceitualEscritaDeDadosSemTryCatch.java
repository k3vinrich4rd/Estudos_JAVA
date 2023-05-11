package br.com.alura.estudos.javacurso.io.outputstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteConceitualEscritaDeDadosSemTryCatch {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Treino2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Líder do campeonato");
        bufferedWriter.newLine();
        bufferedWriter.write("Sete da manhã");
        bufferedWriter.newLine();
        bufferedWriter.write("Autoestima");

        bufferedWriter.close();

    }
}