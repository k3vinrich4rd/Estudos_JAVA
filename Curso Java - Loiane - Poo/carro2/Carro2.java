package carro2;

public class Carro2 {
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeDeCombustivel;
    double consumoDeCombustivel;

    double obterAutonomia(){
        return capacidadeDeCombustivel * consumoDeCombustivel;
    }
    //Método com parâmetros é usado quando não se tem a informação necessária na classe
    double cacularCombustivel(double km){
        double quantidadeDeCombustivel = km/consumoDeCombustivel;
        return quantidadeDeCombustivel;
    }
}
