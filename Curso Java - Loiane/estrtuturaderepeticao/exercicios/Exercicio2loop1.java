package estrtuturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio2loop1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.print("Informe uma nota entre 1 e 10: ");
            double nota = input.nextDouble();
            if (nota > 0 && nota < 10){
                System.out.println("Voc� digitou a nota: " + nota);
                break;
            }else {
                System.out.println("N�mero inv�lido, digite novamente\n");
            }
        }while (true);


    }
}
