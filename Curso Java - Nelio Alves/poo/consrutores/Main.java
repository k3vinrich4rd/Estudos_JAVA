package poo.consrutores;

import poo.entities.triangle.product.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();
        Exemplo1Product product = new Exemplo1Product(name, price, quantity);


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
