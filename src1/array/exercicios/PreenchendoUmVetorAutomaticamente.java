package array.exercicios;
// Preenchendo um Array automaticamente:
import java.util.Arrays;

public class PreenchendoUmVetorAutomaticamente {
    public static void main(String[] args) {
        int [] numeros = new  int[20]; // Array
        Arrays.fill(numeros,10); // Método que preenche o array automaticamente
        for (int num : numeros){ // For Each
            System.out.print(num + " ");
        }
    }
}
