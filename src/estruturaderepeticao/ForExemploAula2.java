package estruturaderepeticao;
//Utilizando estrutura de repetição (for)
import java.util.Scanner;

public class ForExemploAula2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double [] notas = new double[4];
        //Estrutura de repetição
        for (int i = 0; i < notas.length ; i++) { //length = tamanho
            System.out.print("Digite a "+  (i + 1) + "º nota: "); //Para fazer mais sentido no texto de saida para o usuário
            notas[i] = input.nextDouble(); // É para fazer mais sentido para o usuário, mas o indice  SEMPRE começa no zero

        }
        System.out.println("Fim do programa");
    }
}
