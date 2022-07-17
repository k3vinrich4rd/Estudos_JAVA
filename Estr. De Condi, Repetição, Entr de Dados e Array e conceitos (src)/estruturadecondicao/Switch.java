package estruturadecondicao;
/*
switch (Alternar/ Trocar/ Interruptor) definição:
Da mesma forma que o comando if,
o comando switch case controla o fluxo do programa permitindo ao programador
especificar código diferente para ser executado em várias condições.
Em particular, um comando switch compara o valor de uma variável
aos valores especificados nos comandos case.

 */

// utilizando a estrutura condicional switch (Alternar/ Trocar/ Interruptor)
import java.util.Scanner;
// Verificando a quantidade e seu tipo
public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de pernas: ");
        int pernas = entrada.nextInt();
        String tipo;
        entrada.close();

        switch (pernas) { //(Alternar/ Trocar/ Interruptor)
            case 1:
                tipo = "Saci";
                break; // parar
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
        }
        System.out.println("O seu animal de estimação é uma: " + tipo);
    }
}
