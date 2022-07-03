package estruturadecondicao.exercicios;
import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade em anos: ");
        int idade = input.nextInt();

        System.out.print("Digite seus meses de vida desde o último aniversário: ");
        int meses = input.nextInt();

        System.out.print("Digite seus dias de vida desde o início desse mês: ");
        int dias = input.nextInt();

        input.close();

        int tempoDeVidaEmDias = (idade * 365) + (meses * 30) + dias;

        System.out.println("Você viveu o total de " + tempoDeVidaEmDias + " de dias");
    }
}
