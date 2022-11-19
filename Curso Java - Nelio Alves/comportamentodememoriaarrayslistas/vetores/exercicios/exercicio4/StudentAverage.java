package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio4;

import java.util.Scanner;

public class StudentAverage { //Média dos alunos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] namesStudents = new String[n];
        double[] notesStudents = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do " + (i + 1) + "º aluno: ");
            System.out.print("Nome: ");
            namesStudents[i] = input.next();
            System.out.print("Nota: ");
            notesStudents[i] = input.nextDouble();
        }


        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += notesStudents[i];
        }
        double mediaDasNotas = sum / n;
        System.out.printf("Media dos alunos: %.2f\n", mediaDasNotas);


        System.out.println("Alunos acima da média da sala:");
        for (int i = 0; i < n; i++) {
            if (notesStudents[i] > mediaDasNotas) {

                System.out.println(namesStudents[i]);
            }
        }
        input.close();

    }
}
