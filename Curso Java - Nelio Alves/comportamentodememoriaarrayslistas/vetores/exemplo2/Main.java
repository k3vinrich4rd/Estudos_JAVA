package comportamentodememoriaarrayslistas.vetores.exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of products you would like to average values for: ");
        int n = input.nextInt();
        Product[] averageProductPrices = new Product[n];

        for (int i = 0; i < averageProductPrices.length; i++) {
            input.nextLine();
            System.out.print("Enter name " + (i + 1) + "º product: ");
            String nameProduct = input.nextLine();
            System.out.print("Enter price " + (i + 1) + "º product: ");
            double priceProduct = input.nextDouble();
            averageProductPrices[i] = new Product(nameProduct, priceProduct);
        }

        double sum = 0;

        for (int i = 0; i < averageProductPrices.length; i++) {
            sum += averageProductPrices[i].getPrice();
        }

        double averageProducts = sum / averageProductPrices.length;
        System.out.printf("\nAVERAGE PRICE = %.2f ", averageProducts);

        input.close();
    }

}
