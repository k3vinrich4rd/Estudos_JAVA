package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.*;

public class TesteLeituraAtravesDoTecladoSystemIn {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in; //new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fos = new FileOutputStream("lorem2.txt"); //new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = bufferedReader.readLine();

        while (linha != null) {

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bw.close();
    }
}