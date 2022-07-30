package exerciciobasico;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        input.close();


        System.out.print("O número informado foi: " + numero);



        }
    }

