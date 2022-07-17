package array.deduasdimensoes;
// array (vetor/conjunto)
public class ArrayDeDuasDimensoes {
    public static void main(String[] args) {
        // Quando eu preciso criar uma matriz e SEI os valores que serão inseridos:
        int [][] idadesEAnoDeNascimento = {{10, 20, 30}, {2012, 2002, 1992}};
        System.out.println(idadesEAnoDeNascimento[0][0]); //Primeiro a coluna, depois a linha
        System.out.println(idadesEAnoDeNascimento[1][0]);  //Primeiro a coluna depois a linha

        // Quando eu preciso criar uma matriz e NÃO SEI os valores que serão inseridos:
        String[][] nomesESobrenomes = new String[10][10]; // os valores não precisam ser iguais


        // A título de curiosidade
    }
}
