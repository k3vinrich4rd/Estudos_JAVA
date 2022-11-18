package poo.consrutores;

public class Exemplo1Product {


    public String name;
    public double price;
    public int quantity;

    public Exemplo1Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price ;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; //Para somar produtos novos a uma quantidade já existente no estoque

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity; //Para remover produtos novos a uma quantidade já existente no estoque
    }

    public String toString() {
        return name + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
