package carro1;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); // Objeto
        Carro carro2 = new Carro(); // Objeto

        carro1.nome = "Porshe"; // Atributos do objeto
        carro1.modelo = "911"; // Atributos do objeto
        carro1.ano = 2022; // Atributos do objeto

        // Maneira de imprimir tudo na mesma linha (sem quebra):
        System.out.println("O nome do carro é: " + "" + carro1.nome + " o seu modelo é: " + "" + carro1.modelo + "" + " e ano: " + carro1.ano);
        System.out.println();


        carro2.nome = "lamborghini"; // Atributos do objeto
        carro2.modelo = "Aventador"; // Atributos do objeto
        carro2.ano = 2022; // Atributos do objeto

        // Maneira de imprimir tudo na mesma linha (com quebra)
        System.out.println("O nome do carro é: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);


    }
}
