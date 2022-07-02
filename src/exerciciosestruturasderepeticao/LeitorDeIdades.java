package exerciciosestruturasderepeticao;
//Exercício Web: Leia a idade de 20 pessoas e exiba a soma das idades
import java.util.Scanner;

public class LeitorDeIdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 20 para ler as idades de 20 pessoas, e o resultado da soma: ");
        int IdadesInformadas = entrada.nextInt();

        int idades = 0;
        int soma = 0;

        for (int contador = 0; contador < IdadesInformadas; contador++) {
            Scanner entrada2 = new Scanner(System.in);
            System.out.print("Informe a idade da " + (contador + 1) + " º pessoa: ");
            idades = entrada.nextInt();
            soma += idades;
        }
        System.out.println("O resultado da soma de todas idades é: " + soma);
    }
}
