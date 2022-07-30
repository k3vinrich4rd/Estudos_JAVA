package estrtuturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio1Loop3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.print("Informe uma nota entre 1 e 10: ");
            double nota = input.nextDouble();
            if (nota > 0 && nota < 10){
                notaValida = true;
                System.out.println("Você digitou a nota: " + nota);

            }else {
                System.out.println("Número inválido, digite novamente\n");
            }
        }while (!notaValida);

    }
}
