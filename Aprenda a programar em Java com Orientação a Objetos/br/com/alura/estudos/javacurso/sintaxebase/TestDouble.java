package br.com.alura.estudos.javacurso.sintaxebase;

public class TestDouble {
    public static void main(String[] args) {

        double salary;
        salary = 1250.70;
        System.out.printf("My salary is: %.2f\n", salary);

        double division = 500.0 / 2;
        System.out.println("Result the division: " + division);

        int division2 = 5 / 2; // O resultado da divisão vai ser inteiro
        //Isso se deve por conta dos números que estão sendo divididos serem inteiros
        System.out.println("Result the division: " + division2 + "\n");

        double division3 = 5 / 2; // Result: 2.0
        //Isso se deve porque o java analisa a conta primeiro (feitas com inteiros)
        //Para depois encaixar em contexto de double, fazendo o resultado ser impreciso
        System.out.println("Result the division: " + division3);

        //Forma correta de se fazer com um resultado preciso:
        double division4 = 5.0 / 2; //O resultado saiu corretamente porque um dos números tem ponto flutuante
        System.out.println("Result the division: " + division4);

        //Comum: Declarar a variável e já inicializar com um valor
    }
}