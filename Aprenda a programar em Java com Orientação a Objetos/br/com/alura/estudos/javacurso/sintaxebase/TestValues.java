package br.com.alura.estudos.javacurso.sintaxebase;

public class TestValues {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 7;
        secondNumber = firstNumber;
        firstNumber = 10;
        System.out.println(secondNumber);

        //Aqui o resultado é 5, porque estamos fazendo uma cópia de valor
        //Que segue intacta independente de mutabilidades
    }
}