package estrtuturaderepeticao;

public class WhileExemplo {
    public static void main(String[] args) {
        int i = 1;
        int maximo = 10;
        System.out.println("Contando até: " + maximo);

        while (i <= maximo) {
            System.out.println("Valor de i agora é: " + i);
            i++;

        }
        System.out.println("Valor de i: " + i);

        do {
            ++i;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);
    }
}
