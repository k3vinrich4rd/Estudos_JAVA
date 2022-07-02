package exerciciosestruturasderepeticao;
// Exercício web: Escreva um algoritmo que calcule a soma dos números de 1 a 15.
public class CalculoDeSomaDe1a15 {
    public static void main(String[] args) {
        int soma = 0;
        for (int contador = 1; contador <= 15 ; contador++) {
            soma += contador;
            System.out.println(soma);
        }
        System.out.println("Fim do programa, o resultado da de 1 até 15 é: " + soma);
    }
}
