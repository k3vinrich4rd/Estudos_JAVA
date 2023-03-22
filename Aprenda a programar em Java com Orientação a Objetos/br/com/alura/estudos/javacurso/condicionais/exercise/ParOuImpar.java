package br.com.alura.estudos.javacurso.condicionais.exercise;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber se é par ou impar: ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println("O número " + number + " é impar");
        } else {
            System.out.println("O número " + number + " é par");
        }
        input.close();
    }
}