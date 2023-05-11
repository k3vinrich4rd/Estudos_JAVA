package br.com.alura.estudos.javacurso.lambda.formasdeimplementarumainterface;

public class TaxiImpl implements Taxi {
    @Override
    public void reservar() {
        System.out.println("Taxi reservado");
    }
}