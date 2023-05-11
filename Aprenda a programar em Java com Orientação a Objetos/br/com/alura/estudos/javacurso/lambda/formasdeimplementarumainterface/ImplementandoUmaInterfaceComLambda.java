package br.com.alura.estudos.javacurso.lambda.formasdeimplementarumainterface;

public class ImplementandoUmaInterfaceComLambda {
    public static void main(String[] args) {

        Taxi taxi = () -> {
            System.out.println("Reserva efetuada");
        };
        taxi.reservar();
    }

}