package poo.sobrecarga;

public class Exemplo3Product {
    private String name;
    private double price;
    private int quantity;


    public Exemplo3Product() {

    }

    public Exemplo3Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Exemplo3Product(String name, double price) {
        this.name = name;
        this.price = price;
        //A linguagem java por padrão inicia números de objetos e arrays como zero por padrão
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
