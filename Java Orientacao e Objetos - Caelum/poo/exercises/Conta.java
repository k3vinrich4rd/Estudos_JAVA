package poo.exercises;

public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void sacar(double quantia) {
        this.saldo = -quantia;
    }

    void depositar(double quantia) {
        this.saldo = +quantia;
    }

    void calcularRendimento() {
        double rendimento = 0.1;
        this.saldo = this.saldo * rendimento;
    }

    String recuperarDadosParaImpressao(){
        return
                "Informações da conta: \n" +
                        "Nome do proprietário da conta: " + this.titular + "\n" +
                        "Numero da conta: " + this.numero + "\n" +
                        "Agência da conta: " + this.agencia + "\n" +
                        "Data de abertura da conta: " + "\nDia: " + this.dataDeAbertura.dia +"\n"+
                        "Mes: " + this.dataDeAbertura.mes + "\n" + "Ano: " + this.dataDeAbertura.ano ;
    }
}
