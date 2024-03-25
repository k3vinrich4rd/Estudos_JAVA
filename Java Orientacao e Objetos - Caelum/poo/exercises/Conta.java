package poo.exercises;

public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void sacar(double quantia) {
        this.saldo = this.saldo - quantia;
    }

    void depositar(double quantia) {
        this.saldo = this.saldo + quantia;
    }

    double calcularRendimento() {
        return this.saldo * 0.1;
    }

    String recuperarDadosParaImpressao() {
        return
                "Informações da conta: \n" +
                        "Nome do proprietário da conta: " + this.titular + "\n" +
                        "Numero da conta: " + this.numero + "\n" +
                        "Agência da conta: " + this.agencia + "\n" +
                        "Saldo da conta: " + this.saldo + "\n" +
                        "Rendimento da conta: " + this.calcularRendimento() + "\n" +
                        "Data de abertura: " + this.dataDeAbertura.formatada();
    }
}
