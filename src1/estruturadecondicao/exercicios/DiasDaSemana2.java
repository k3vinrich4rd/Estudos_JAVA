package estruturadecondicao.exercicios;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usuário.
 */
import java.util.Scanner;

public class DiasDaSemana2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 7, para saber se é dia útil ou final de semana: ");
        int diasDaSemana = entrada.nextInt();
        entrada.close();
        // Segunda forma de se utilizar o switch
        switch (diasDaSemana) {
            case 1:
                System.out.print("1 - Domingo");
                break; // break(pare) permite que as informações não vaze
            case 2:
                System.out.print("2 - Segunda Feira");
                break; // break(pare) permite que as informações não vaze
            case 3:
                System.out.print("3 - Terça Feira");
                break;// break(pare) permite que as informações não vaze
            case 4:
                System.out.print("4 - Quarta Feira");
                break;// break(pare) permite que as informações não vaze
            case 5:
                System.out.print("5 - Quinta Feira");
                break;// break(pare) permite que as informações não vaze
            case 6:
                System.out.print("6 - Sexta Feira");
                break;// break(pare) permite que as informações não vaze
            case 7:
                System.out.print("7 - Sábado");
                break;// break(pare) permite que as informações não vaze
            default:
                System.out.print("Número inválido");

            }
        }
    }
