package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.*;

public class TreinoConceitualUtilizandoTryCatch {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("desafio.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}