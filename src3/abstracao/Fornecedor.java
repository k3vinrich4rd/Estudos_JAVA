package abstracao;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    private double saldo;

    public Fornecedor() {
        super();
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
        this.saldo = 0;

    }
    public void obterSaldo(double valorCredito, double valorDivida){
        saldo = valorCredito - valorDivida;
        System.out.println("Meu saldo é de: " + saldo);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


}
