package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeituraDeDados {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo
        FileInputStream fileInputStream = new FileInputStream("lorem.txt"); //obtém os byes de entrada relacionado ao arquivo
        //Transforma os bytes em caracteres
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //Leitura da entrada desse fluxo de dados
        //Junta vários caracteres que estão presentes em uma linha
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //Armazenamento e leitura desses dados
        String linha = bufferedReader.readLine(); //Lendo linha por linha
        System.out.println(linha); //Impressão do log
        bufferedReader.close();

        /*Por debaixo dos panos o FileInputStream etá sendo administrado por InputStreamReader
        E o inputStreamReader pelo BufferReader, e quando efetuamos a leitura, o BufferedReader
        pede para o InputStreamReader a linha de caracteres e o InputStreamReader pede ao FileInputStream
        os bits e bytes, e o FileInputStream lê os dados no seu argumento. */
    }
}