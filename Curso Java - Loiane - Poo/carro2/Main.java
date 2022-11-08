package carro2;


public class Main {
    public static void main(String[] args) {
        Carro2 carro = new Carro2();
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numeroDePassageiros = 10;
        carro.capacidadeDeCombustivel = 100;
        carro.consumoDeCombustivel = 0.2;
        double quantidadeDeCombustivel10 = carro.cacularCombustivel(10);
        double quantidadeDeCombustivel15 = carro.cacularCombustivel(15);

        System.out.println("A autonomia do carro é de: " + carro.obterAutonomia() + " km/h");
        System.out.println("Para o carro andar 10km é necessário " + quantidadeDeCombustivel10 + " de combustivel");
        System.out.println("Para o carro andar 15km é necessário " + quantidadeDeCombustivel15 + " de combustivel");


    }
}
