package carro1;

public class Main {
    public static void main (String[] args){
        Carro1 van = new Carro1();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDePassageiros = 10;
        van.capacidadeDeCombustivel = 100;
        van.consumoDeCombustivel = 0.2;

        Carro1 fusca = new Carro1();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroDePassageiros = 4;
        fusca.capacidadeDeCombustivel = 30;
        fusca.consumoDeCombustivel = 0.15;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);




    }
}
