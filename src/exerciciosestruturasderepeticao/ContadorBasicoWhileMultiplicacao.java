package exerciciosestruturasderepeticao;

public class ContadorBasicoWhileMultiplicacao {
    public static void main(String[] args) {
       int contador = 0;
        while (contador <= 100000) {
            System.out.println(contador);
            contador += 1000;
        }
        System.out.print("Fim do programa.");
    }
}
