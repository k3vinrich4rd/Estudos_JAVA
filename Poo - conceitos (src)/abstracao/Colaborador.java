package abstracao;

public class Colaborador extends Pessoa {
    private Integer codigoSetor;
    private double salarioBase;
    private double imposto;
    private double salarioLiquido;

    public Colaborador() {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.salarioLiquido = salarioLiquido;
    }

    public void calcularSalario(double salarioBase, double imposto) {
        salarioLiquido = salarioBase - imposto;
        System.out.println("O valor do salário líquido é de: " + salarioLiquido);
    }

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}

