package br.com.alura.estudos.javacurso.sintaxebase;

public class Conversoes {
    public static void main(String[] args) {

        //Um double recebendo um valor inteiro é possível
        //Um int. Recebendo um valor double é impossível (Tem que converter)
        double salary = 1270.50;
        int value = (int) salary; //Casting
        System.out.println("Value the salary: " + value + "\n"); //Vai retornar somente o valor inteiro do número


        double firstValue = 0.2;
        double secondValue = 0.1;
        double total = firstValue + secondValue;
        System.out.println("Result the sum with double " + total + "\n");


        //Declarando um tipo float
        float pi = 3.14f;
        System.out.println("Value the pi " + pi);

    }
}