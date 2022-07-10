package estruturadecondicao;
// Declarando uma array:
public class ForEachGuanabara {
    public static void main(String[] args) {
        int[] numeros = {20, 30, 50, 40};
        // Quando tiver dois elementos e dois pontos (:) é um ForEach
        // A variável num vai ser alimentada pelos elementos de da variavel números (a cada loop)
        for (int num : numeros) { // Não precisa de indices
            System.out.print(num + " " );
        }
    }
}