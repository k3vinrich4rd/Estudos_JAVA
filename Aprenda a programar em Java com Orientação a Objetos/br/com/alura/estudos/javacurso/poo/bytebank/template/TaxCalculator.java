package br.com.alura.estudos.javacurso.poo.bytebank.template;

public class TaxCalculator {

    private double totalTaxLevied;

    //Pega o valor do imposto e calcula conforme a sua regra de negócio
    //Depois desse calculado ele retorna o valor calculado desses impostos
    public void registerTaxable(Taxable taxable) {
        double valueTaxable = taxable.getValue();
        totalTaxLevied += valueTaxable;
    }

    public double getTotalTaxLevied() {
        return this.totalTaxLevied;
    }

}