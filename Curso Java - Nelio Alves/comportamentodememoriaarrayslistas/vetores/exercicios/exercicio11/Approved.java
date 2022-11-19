package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio11;

import java.util.Scanner;

public class Approved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students will be entered? ");
        int n = input.nextInt();

        String[] namesStudents = new String[n];
        double[] firstNote = new double[n];
        double[] secondNote = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, first and second note of " + (i + 1) + "º student:");
            input.nextLine();
            namesStudents[i] = input.nextLine();
            firstNote[i] = input.nextDouble();
            secondNote[i] = input.nextDouble();
        }


        double average = 0;
        System.out.println("Approved students: ");

        for (int i = 0; i < n; i++) {
            average = firstNote[i] + secondNote[i] / 2;
            if (average >= 6) {
                System.out.println(namesStudents[i]);
            }
        }

        input.close();
    }
}
