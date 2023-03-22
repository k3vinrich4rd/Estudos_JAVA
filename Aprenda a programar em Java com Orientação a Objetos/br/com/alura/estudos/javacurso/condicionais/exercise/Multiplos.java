package br.com.alura.estudos.javacurso.condicionais.exercise;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
 */
public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois numeros e saiba se eles são multiplos");
        System.out.print("Digite o primeiro número: ");
        int firsNumber = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = input.nextInt();

        if (firsNumber % secondNumber == 0 || secondNumber % firsNumber == 0) {
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }
    }
}