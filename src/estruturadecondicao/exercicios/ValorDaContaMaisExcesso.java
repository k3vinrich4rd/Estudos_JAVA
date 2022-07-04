package estruturadecondicao.exercicios;

import java.util.Scanner;

public class ValorDaContaMaisExcesso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe os minutos usados: ");
        int minutos= input.nextInt();
        int minutosUsados = 100;
        double valorDaConta = 50;
        double excessoDeMinutos = valorDaConta + (minutos - 100) * 2.0;
        input.close();

        if (minutos > 100) {
            System.out.printf("Valor da conta %.2f R$ por conta do excesso de minutos usados",excessoDeMinutos);
        }else{
            System.out.printf("Valor da conta %.2f R$", valorDaConta);
        }
    }
}
