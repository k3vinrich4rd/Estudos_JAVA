package estruturaderepeticao;

public class ForEach {
    //Declarando um for each:
    public static void main(String[] args) {
        int[] idades = {10, 20, 30}; // vetor/ array
        // for each = para cada
        // para cada idade do tipo int em idades faça
        // Estrutura de repetição:
        for (int idade : idades) {   // idade = nome que se dá para o que está dentro do vetor
            System.out.println(idade); // Não precisa de controlador, pois ele sabe onde parar
        } // O For Each conta somente de 1 em 1


    }
}

