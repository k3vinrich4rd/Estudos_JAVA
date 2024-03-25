package poo.exercises;

public class TestaConta5 {
    public static void main(String[] args) {

        Data data = new Data();
        Conta conta = new Conta();

        conta.titular = "Kevin Richard";
        conta.numero = 12345678;
        conta.agencia = "agência teste";
        conta.saldo = 1000.0;
        conta.sacar(100.0);
        conta.depositar(200.0);


        data.dia = 20;
        data.mes = 3;
        data.ano = 2024;

        conta.dataDeAbertura = data;
        System.out.println(conta.recuperarDadosParaImpressao());


    }
}
