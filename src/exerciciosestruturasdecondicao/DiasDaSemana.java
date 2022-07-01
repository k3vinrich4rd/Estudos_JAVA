package exerciciosestruturasdecondicao;

import java.util.Scanner;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usuário.
 */
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número, para saber o dia da semana: ");
        int numero = entrada.nextInt();
        entrada.close();
        // variáveis que switch aceita: char, int, byte, short, enum e String
        switch (numero) {
            case 1:
                System.out.print(" 1 - Domingo");
                break;
            case 2:
                System.out.print("2 - Segunda");
                break;
            case 3:
                System.out.print("3 - Terça");
                break;
            case 4:
                System.out.print("4 - Quarta");
                break;
            case 5:
                System.out.print("5 - Quinta");
                break;
            case 6:
                System.out.print("6 - Sexta");
                break;
            case 7:
                System.out.print("Sábado");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
