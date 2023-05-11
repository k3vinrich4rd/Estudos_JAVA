package br.com.alura.estudos.javacurso.lambda.formasdeimplementarumainterface;

public class ImplementandoUmaInterfaceComLambda2 {
    public static void main(String[] args) {

        //Aqui o lambda é feita sem chaves, pois só é necessário usar chaves quando se tem retorno
        Taxi taxi = () -> System.out.println("Reserva efetuada");
        taxi.reservar();

    }
}