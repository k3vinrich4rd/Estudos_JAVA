package array.array;
//Declarando uma array:
public class ArrayExemplo3 {
    public static void main(String[] args) {
        // Quando eu não sei os valores e tenho que declarar:
        String[] nomes = new String[4];

        nomes[0] = "Kevin Richard"; // Valores declarados
        nomes[1] = "Vilma"; // Valores declarados
        nomes[2] = "Eduardo"; // Valores declarados
        nomes[3] = "Ketelyn"; // Valores declarados

        for (int contador = 0; contador < nomes.length ; contador++) { //length = cumprimento da variável
            System.out.println(nomes[contador]);
        }

    }
}
