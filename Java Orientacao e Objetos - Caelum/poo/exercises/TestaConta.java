package poo.exercises;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.titular = "Kevin Richard";
        conta.numero = 12345678;
        conta.agencia = "agência teste";
        conta.saldo = 1000.0;
        conta.dataDeAbertura.dia = 20;
        conta.dataDeAbertura.mes = 3;
        conta.dataDeAbertura.dia = 2024;

        System.out.println(conta.recuperarDadosParaImpressao());
    }
}
