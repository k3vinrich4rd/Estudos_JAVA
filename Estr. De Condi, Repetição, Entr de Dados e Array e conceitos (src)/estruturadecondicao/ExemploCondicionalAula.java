package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula {
    public static void main(String[] args) {
        /*
        Se a média for menor ou igual a 6, está reprovado
        se a média for menor ou igual a 8, está aprovado
        Se a média for maior que 8 está aprovado com louvor
         */
        double media = 7;
        // Estrutura condicional:
        if (media <= 6) {
            System.out.println("Está reprovado");
        } else if ((media <= 6) && (media <= 8)) {
            System.out.println("Está aprovado");
        } else {
            System.out.println("Aprovado com louvor");
        }


    }
}
