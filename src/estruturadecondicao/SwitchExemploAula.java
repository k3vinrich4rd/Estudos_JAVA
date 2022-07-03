package estruturadecondicao;

import java.util.Scanner;

public class SwitchExemploAula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua opção: ");
        int opcao = input.nextInt();
        input.close();

        switch (opcao) { // não faz métodos comparativos, não aceita boolean e só aceita somente igual
            case 1:
                System.out.println("Sua opção foi o número 1");
                break; // Break é uma ordem de fluxo, onde sem para o fluxo
            case 2:
                System.out.println("Sua opção foi o número 2");
                break; // Break (parar) para não passar para as outras validações
            default: // como se fosse um else
                System.out.println("Opção inválida");
                /*
                 Diferente do if, pois quando ele bate na primeira opção e entende o que aquela opção corresponde
                 ao que foi proposto, ele faz a lógica e para, não tendo a necessidade de ter break
                 */

        }
    }
}
