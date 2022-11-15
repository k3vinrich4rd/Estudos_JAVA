package poo.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        student.name = input.nextLine();
        student.firstNote = input.nextDouble();
        student.secondNote = input.nextDouble();
        student.thirdNote = input.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", student.finalNote());

        if (student.finalNote() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        input.close();

    }
}
