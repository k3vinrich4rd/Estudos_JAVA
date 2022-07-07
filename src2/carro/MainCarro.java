package carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Porshe";
        carro1.modelo = "911";
        carro1.ano = 2022;

        System.out.println("O nome do carro é: " + "" + carro1.nome + " o seu modelo é: " + "" + carro1.modelo + "" + " e ano: " + carro1.ano );
        System.out.println();

        Carro carro2 = new Carro();
        carro2.nome = "lamborghini";
        carro2.modelo = "Aventador";
        carro2.ano = 2022;

        System.out.println("O nome do carro é: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);


    }
}
