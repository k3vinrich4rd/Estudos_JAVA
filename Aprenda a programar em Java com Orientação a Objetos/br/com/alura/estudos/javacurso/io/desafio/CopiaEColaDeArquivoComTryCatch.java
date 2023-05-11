package br.com.alura.estudos.javacurso.io.desafio;

import java.io.*;

public class CopiaEColaDeArquivoComTryCatch {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("Treino2.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileOutputStream fileOutputStream = new FileOutputStream("Treino3");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}