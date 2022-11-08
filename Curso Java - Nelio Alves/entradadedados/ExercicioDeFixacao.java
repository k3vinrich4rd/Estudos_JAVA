package entradadedados;

import java.util.Locale;

public class ExercicioDeFixacao {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        System.out.println("\nRecord:" + age + " years old, code " + code + " and gender: " + gender);

        System.out.println("\nMeasure with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US); //O separador decimal vira o ponto na linha abaixo
        System.out.printf("US decimal point: %.3f", measure);
    }
}