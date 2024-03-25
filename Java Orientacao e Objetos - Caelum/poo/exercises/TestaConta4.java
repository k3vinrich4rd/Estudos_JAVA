package poo.exercises;

public class TestaConta4 {
    public static void main(String[] args) {

        Data data = new Data();
        data.dia = 20;
        data.mes = 3;
        data.ano = 2024;


        Conta c1 = new Conta();
        c1.titular = "Kevin Richard";
        c1.saldo = 100;

        c1.dataDeAbertura = data;
        System.out.println(c1.recuperarDadosParaImpressao());


    }
}
