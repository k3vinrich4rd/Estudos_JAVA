package estruturaderepeticao.exercicios;
// Utilizando uma estrutura de repetição (do while):
import java.util.Scanner;

public class DoWhileCondicao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDaProfessora;
        double nota1;
        double nota2;
        double nota3;
        double media;
        // Estrutura de repetição:
        do {
            System.out.print("Informe a primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Informe a segunda nota: ");
            nota2 = entrada.nextDouble();

            System.out.print("Informe a terceira nota: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.print("Quer continuar somando as médias dos alunos? [Sim/Não]: ");
            respostaDaProfessora = entrada.next();
            // loop
        }while (respostaDaProfessora.equalsIgnoreCase("sim"));
        System.out.printf("A média do aluno é: %.2f " , media);

    }
}