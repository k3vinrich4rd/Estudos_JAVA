package heranca;

import java.math.BigDecimal;

public abstract class Carro {
    private String cor;
    private String motor;
    private String fabricante;
    private BigDecimal preco;
    private int quantidadeDePortas;

    public Carro(String cor, String motor, String fabricante, BigDecimal preco, int quantidadeDePortas) {
        this.cor = cor;
        this.motor = motor;
        this.fabricante = fabricante;
        this.preco = preco;
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public Carro() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void ligarCarro(boolean b) {

    }

    public void desligarCarro(boolean b) {
        
    }
}