package array;
// Fazendo uma busca através da posição dos indices
import java.util.Arrays;

public class ComoFazerUmaBusca {
    public static void main(String[] args) {
        int [] vetor = {3, 7, 6, 1, 9, 4, 2}; // Vetor
        for (int vet : vetor){ // ForEach
            System.out.print(vet + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vetor, 4); // Se o resultado for negativo é que o indices pesquisados não existem
        System.out.println("Encontrei o valor na posição " + p);
    }
}
