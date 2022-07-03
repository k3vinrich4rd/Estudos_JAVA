package estruturadecondicao.exercicios;

import java.util.Scanner;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usuário.
 */
public class DiasDaSemana3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 7, para saber se é dia útil ou final de semana: ");
        int diasDaSemana = entrada.nextInt();
        entrada.close();

        switch (diasDaSemana){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
