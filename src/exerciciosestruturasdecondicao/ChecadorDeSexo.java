package exerciciosestruturasdecondicao;

import java.util.Scanner;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usuário.
 */
public class ChecadorDeSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu sexo, Digite 'm' para Masculino, 'f' para Feminino e 'nb' Para Não Binário: ");
        String sexo = entrada.nextLine();
        entrada.close();

        switch (sexo) {
            case "m":
                System.out.println("O seu gênero é masculino");
                break;
            case "f":
                System.out.println("O seu gênero é feminino");
                break;
            case "nb":
                System.out.println("Você é não binário");
                break;
            default:
                System.out.println("Valor inválido, informe as opções indicadas ");

        }

    }
}
