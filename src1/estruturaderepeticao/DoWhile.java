package estruturaderepeticao;
/*
Do (faça) While (Enquanto) definição:
O loop do while do java é usado para repetir uma parte do programa algumas vezes.
Se o número de iterações não é fixo e você precisa executar o loop pelo menos uma vez.
É recomendado o uso do loop do while.
O loop do while é executado pelo menos uma vez porque a condição é checada depois do corpo do loop.

 */
// Utilizando a estrutura de repetição do (faça) while (enquanto).
public class DoWhile {
    public static void main(String[] args) {
        int contador = 0; // começo
        do {
            System.out.println("Cambalhota");
            contador++; // contador do ciclo
        }while (contador < 4); // fim
    }
}
