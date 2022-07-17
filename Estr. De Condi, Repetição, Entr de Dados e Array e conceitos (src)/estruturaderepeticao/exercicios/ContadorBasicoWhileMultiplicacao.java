package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (while)
public class ContadorBasicoWhileMultiplicacao {
    public static void main(String[] args) {
       int contador = 0;
       // Estrutura de repetição:
        while (contador <= 100000) {
            System.out.println(contador);
            contador += 1000;
        }
        System.out.print("Fim do programa.");
    }
}
