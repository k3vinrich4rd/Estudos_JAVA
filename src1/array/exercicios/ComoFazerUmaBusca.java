package array.exercicios;
// Fazendo uma busca através da posição dos indices
import java.util.Arrays;

public class ComoFazerUmaBusca {
    public static void main(String[] args) {
        int [] vetor = {3, 7, 6, 1, 9, 4, 2}; // Vetor
        Arrays.sort(vetor); // coloca um vetor em ordem numerica
        for (int vet : vetor){ // ForEach
            System.out.print(vet + " ");
        }
        System.out.println(""); // O resultado da busca sempre vai ser número -1
        int posicao = Arrays.binarySearch(vetor, 2); // Se o resultado for negativo é que o indices pesquisados não existem
        System.out.println("Encontrei o valor na posição " + posicao);
        System.out.println(posicao);
    }
}
