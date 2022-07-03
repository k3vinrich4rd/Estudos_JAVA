package estruturadecondicao.exercicios;
import java.util.Scanner;
public class ControlePecuario {
    public static void main(String[] args) {
            double pesoPadrao = 50;
            double multaPadrao = 4;

            Scanner input = new Scanner(System.in);
            System.out.print("Informe o peso do peixe: ");
            double peso = input.nextDouble();
            input.close();

            double excesso = peso - pesoPadrao;
            double multaAPagar = excesso * multaPadrao;

            if (excesso > 0) {
                System.out.println("O peso do peixe é: " + peso);
                System.out.println("A multa a ser paga é: " + multaAPagar);
            } else {
                System.out.println("O peso do peixe é: " + peso);
                System.out.println("Você não precisa pagar multa!");
            }
        }
    }

