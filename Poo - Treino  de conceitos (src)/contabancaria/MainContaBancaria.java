package contabancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria();
        pessoa1.setNumeroDaConta(1111);
        pessoa1.setDonoDaConta("Kevin Richard");
        pessoa1.abrirConta("Conta corrente");
        pessoa1.depositar(100);
        pessoa1.sacar(50);
        pessoa1.pagarMensalidade();
        pessoa1.estadoAtual();
        System.out.println();

        ContaBancaria pessoa2 = new ContaBancaria();
        pessoa2.setNumeroDaConta(4254);
        pessoa2.setDonoDaConta("Ketelyn Mayara");
        pessoa2.abrirConta("Conta poupança");
        pessoa2.depositar(500);
        pessoa2.estadoAtual();

    }
}
