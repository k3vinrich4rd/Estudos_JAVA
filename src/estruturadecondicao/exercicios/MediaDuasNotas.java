package estruturadecondicao.exercicios;
// Utilizando estrutura de controle condicional simples
// código: média de duas notas (utilizando o if (se) )
import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDoAluno;
        nomeDoAluno = entrada.nextLine();
        System.out.print("Olá " + nomeDoAluno + ", informe as suas notas e veja se está aprovado ou reprovado\n");
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = entrada.nextDouble();
        entrada.close();

        double mediaDasNotas = (nota1 + nota2) / 2;
        if (mediaDasNotas > 9) {
            System.out.println("Parabéns");
            System.out.printf("Sua média foi de: %.2f" , mediaDasNotas);
        }

    }

}

