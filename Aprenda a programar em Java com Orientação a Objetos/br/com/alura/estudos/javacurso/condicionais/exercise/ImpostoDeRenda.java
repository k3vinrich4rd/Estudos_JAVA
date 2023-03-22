package br.com.alura.estudos.javacurso.condicionais.exercise;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double imposto;

        if (salary <= 2000.0) {
            System.out.println("Free");
        } else if (salary <= 3000.0) {
            imposto = (salary - 2000.0) * 0.08;
            System.out.println(imposto);
        } else if (salary <= 4500.0) {
            imposto = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f ", imposto);
        } else {
            imposto = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f ", imposto);
        }

        input.close();
    }
}