package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class BonusControl {

    private double sum;

    public BonusControl() {

    }

    public double getSum() {
        return this.sum;
    }

    //Polimorfismo
    //Mesmo utilizando uma referência genérica de funcionário no parâmetro
    //Quando um objeto de uma subclasse acessar esse mesmo método
    //Vai sobrescrever o método conforme o sua regra de negócio estabelecida na sua classe
    public void register(Employee employee) {
        double bonus = employee.bonus();
        this.sum += bonus;
    }
}