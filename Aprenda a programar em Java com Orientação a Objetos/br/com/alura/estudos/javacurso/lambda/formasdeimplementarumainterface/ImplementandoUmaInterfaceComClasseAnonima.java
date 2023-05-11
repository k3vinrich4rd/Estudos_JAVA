package br.com.alura.estudos.javacurso.lambda.formasdeimplementarumainterface;

public class ImplementandoUmaInterfaceComClasseAnonima {
    public static void main(String[] args) {

        Taxi taxi = new Taxi() {
            @Override
            public void reservar() {
                System.out.println("Reserva efetuada");
            }
        };
        taxi.reservar();

    }
}