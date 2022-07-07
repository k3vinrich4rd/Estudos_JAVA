package estruturadecondicao.exercicios;

import java.util.Scanner;

// Utilizando estrutura condicionais encadeadas e de multipla escolha
// utilizando if (se), else (se não) e conectivos lógicos, como:
// && (e) e || (ou)
// Verificando se uma pessoa pode votar ou não, através do seu ano de nascimento.

public class ClassificacaoSePodeVotar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner = ler
        System.out.print("Informe seu ano de nascimento: "); // Imprimir no sistema de saída
        int anoDeNascimento = entrada.nextInt();
        entrada.close();

        int idade = 2022 - anoDeNascimento;
        if (idade < 16) {
            System.out.print("Não votar");
        }else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) { // Quando se trata do conectivo lógico && (e)
                System.out.print("Opcional"); // Ambas condições têm que ser verdadeiras, ou se encaixar no || (ou)
            }else {                             // Somente nesse caso
                System.out.print("Obrigatório\n");
                System.out.print("Você tem: " + idade + " anos de idade");
            }
        }
    }
}
