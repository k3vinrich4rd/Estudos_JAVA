package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.*;

public class TesteLeituraDeDadosComWhileEClasseMaes {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo
        InputStream fileInputStream = new FileInputStream("lorem.txt"); //obtém os byes de entrada relacionado ao arquivo
        //Transforma os bytes em caracteres
        Reader inputStreamReader = new InputStreamReader(fileInputStream); //Leitura da entrada desse fluxo de dados
        //Junta vários caracteres que estão presentes em uma linha
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //Armazena esses dados e retorna
        String linha = bufferedReader.readLine(); //Lendo linha por linha


        while (linha != null) {
            System.out.println(linha); //Impressão do log
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();

        /*Por debaixo dos panos o FileInputStream etá sendo administrado por InputStreamReader
        E o inputStreamReader pelo BufferReader, e quando efetuamos a leitura, o BufferedReader
        pede para o InputStreamReader a linha de caracteres e o InputStreamReader pede ao FileInputStream
        os bits e bytes, e o FileInputStream lê os dados que está no seu argumento . */
    }
}