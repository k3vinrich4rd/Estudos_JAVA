package contacorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numeroDaConta = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.saldo = 700;
        contaCorrente.especial = false;
        contaCorrente.limite = 1500;

        System.out.println("O saldo da conta " + contaCorrente.numeroDaConta + " é " + contaCorrente.saldo);
    }
}
