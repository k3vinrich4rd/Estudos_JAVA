package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (do while):
import java.util.Scanner;

public class ContadorBasico3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDigitadas = "";


        // Estrutura de repetição:
        do {

            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();

            if (idade <= 15) {
                System.out.println("Você é menor de idade");
            }
            System.out.println("Você ainda quer que a contagem continue? Sim ou Não: ");
            String respostaDigitada = entrada.next();
        } while (respostaDigitadas.equalsIgnoreCase("Sim"));


    }
}
