package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreinoConceitualSemTryCatch {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("desafio.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}