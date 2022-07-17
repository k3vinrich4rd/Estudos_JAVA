package estruturaderepeticao;
/*
For (para) definição:
Executa a declaração e expressão de laço repetidamente,
até que a condição da expressão se torne falsa
 */
//Utilizando a estrutura de repetição for (Para) para contar de 1 a 3
public class For {
    public static void main(String[] args) {
        int contadorCambalhotas = 0;
        //  Estrutura de repetição:
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) +" º Cambalhota");
            contadorCambalhotas += 1;
        }
        System.out.println("Você deu: " + contadorCambalhotas + " cambalhotas");
    }
}
