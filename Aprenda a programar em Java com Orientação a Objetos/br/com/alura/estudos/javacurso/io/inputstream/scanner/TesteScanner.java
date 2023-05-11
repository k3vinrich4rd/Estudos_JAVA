package br.com.alura.estudos.javacurso.io.inputstream.scanner;

import java.io.File;
import java.util.Scanner;

//Utilizando um Scanner para ler dados de entrada
public class TesteScanner {
    public static void main(String[] args) throws Exception {

        //Nesse contexto, não é possível utilizar somente o nome do arquivo passando como String
        //É necessário fazer a criação de um novo file
        Scanner input = new Scanner(new File("contas.csv"));
        while (input.hasNextLine()) {//Verifica se o que esta sendo lido tem uma próxima linha e devolve um true
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

    }
}