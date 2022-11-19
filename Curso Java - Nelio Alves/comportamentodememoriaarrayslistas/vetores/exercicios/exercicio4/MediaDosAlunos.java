package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio4;

import java.util.Scanner;

public class MediaDosAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int n = input.nextInt();

        String[] nomesAlunos = new String[n];
        double[] notasAlunos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do " + (i + 1) + "º aluno: ");
            System.out.print("Nome: ");
            nomesAlunos[i] = input.next();
            System.out.print("Nota: ");
            notasAlunos[i] = input.nextDouble();
        }


        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += notasAlunos[i];
        }
        double mediaDasNotas = soma / n;
        System.out.printf("Media dos alunos: %.2f\n", mediaDasNotas);


        System.out.println("Você foi o aluno acima da média da sala:");
        for (int i = 0; i < n; i++) {
            if (notasAlunos[i] > mediaDasNotas) {

                System.out.println(nomesAlunos[i]);
            }
        }
        input.close();

    }
}
