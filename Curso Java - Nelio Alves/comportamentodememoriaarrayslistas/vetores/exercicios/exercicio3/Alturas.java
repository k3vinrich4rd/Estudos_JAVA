package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio3;


import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = input.next();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            System.out.print("Altura: ");
            alturas[i] = input.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }
        double mediaDasAlturas = soma / n;

        System.out.printf("\nAltura média: %.2f", mediaDasAlturas);

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                contador += 1;
            }
        }

        double porcentagem = contador * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f %%%n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        input.close();

    }
}

