package poo.entities.triangle.product;

public class Product {

    public String name;
    public double price;
    public int quantity;

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
                + String.format("%.2f", price) + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
