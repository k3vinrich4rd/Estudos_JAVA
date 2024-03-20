package poo;

public class TestProgram {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();

        //Alterando os valores da conta
        minhaConta.holder = "Duke";
        minhaConta.balance = 1000.0;

        //Saca 200 reais
        minhaConta.saca(200);

        //deposita 500 reais
        minhaConta.deposita(500);
        System.out.println("Saldo atual: " + minhaConta.balance);
    }
}
