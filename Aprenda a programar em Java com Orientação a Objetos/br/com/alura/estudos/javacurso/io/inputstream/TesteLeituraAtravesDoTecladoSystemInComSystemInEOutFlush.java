package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.*;

public class TesteLeituraAtravesDoTecladoSystemInComSystemInEOutFlush {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in; //new FileInputStream("lorem.txt");
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fos = System.out; //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty()) {

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bw.close();
    }
}