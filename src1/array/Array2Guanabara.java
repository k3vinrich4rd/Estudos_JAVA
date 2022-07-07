package array;
// Outra maneira de se criar uma Array (Vetor)

public class Array2Guanabara {
    public static void main(String[] args) {
        // Quando tenho o tamanho, mas não a informação:
        int idades[] = new int[4]; // new = novo objeto
        idades[0] = 15; // informação
        idades[1] = 18; // informação
        idades[2] = 19; // informação
        idades[3] = 25; // informação

        // Quando tenho a informação e automaticamente o tamanho:

        int idades2[] = {20, 30, 50, 60};

        for (int contador = 0; contador <=idades.length - 1; contador++) {
            System.out.println("Na posição " + contador + " temos o valor: " + idades[contador]);

        }
        System.out.println();
        for (int contador2 = 0; contador2 <= idades.length - 1; contador2++) {
            System.out.println("Na posição " + contador2 + " temos o valor: " + idades2[contador2]);

        }

    }
}
