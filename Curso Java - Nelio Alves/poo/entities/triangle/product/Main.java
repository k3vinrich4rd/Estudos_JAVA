package poo.entities.triangle.product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

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
