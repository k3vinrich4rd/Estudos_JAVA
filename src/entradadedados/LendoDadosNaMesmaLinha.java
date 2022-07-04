package entradadedados;

import java.util.Scanner;
// Para ler dados na mesma linha:
public class LendoDadosNaMesmaLinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe os dados: ");
        String nome = input.next(); // os dados que serão informados
        int idade = input.nextInt(); // tem que estar logo abaixo do sout
        double altura = input.nextDouble();
        input.close(); // sempre fechar com o input close

        System.out.println("Os dados lidos foram: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);


    }
}
