package br.com.alura.estudos.javacurso.poo.bytebank.template;

public class LifeInsurance implements Taxable {

    //Classe que implementa o contrato estabelecido pela interface
    @Override
    public double getValue() {
        return 42;
    }
}