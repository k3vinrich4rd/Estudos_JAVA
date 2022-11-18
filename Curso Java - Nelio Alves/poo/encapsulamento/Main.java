package poo.encapsulamento;

import poo.sobrecarga.Exemplo3Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        Exemplo3Product product = new Exemplo3Product(name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Update price: " + product.getPrice());

        System.out.println("\nProduct data: " + product); // ou product.toString

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantityAdd = input.nextInt();
        product.addProducts(quantityAdd);

        System.out.println("\nUpdate data: " + product); // ou product.toString

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantityRemove = input.nextInt();
        product.removeProducts(quantityRemove);

        System.out.println("\nUpdate data: " + product); // ou product.toString

        input.close();
    }
}
