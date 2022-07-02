package exerciciosestruturasderepeticao;

public class ContadorBasicoDoWhileMultiplicacao {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println(contador);
            contador += 5;

        } while (contador <= 100);
        System.out.println("Fim do programa.");
     }
}

