package estruturaderepeticao.exercicios;

public class Machadadas {
    public static void main(String[] args) {
        System.out.println("Derrube uma arvore com 11 machadadas");
        int machadada = 10;
        for (int contador = 0; contador < machadada; contador++) {
            System.out.println((contador + 1) + "º machadada");
        }
        if (machadada == 11) {
            System.out.println("você conseguiu derrubar a arvore");
        }else{
            System.out.println("Tente de novo, você não conseguiu");
            System.out.println();
        }

        int contadorMachadada = 0;
        while (contadorMachadada < 11){
            System.out.println((contadorMachadada + 1) + "º machadada");
            contadorMachadada++;
        }
        if (contadorMachadada == 11){
            System.out.println("Parabéns, você conseguiu derrubar a arvore.");
        }else {
            System.out.println("Você não conseguiu derrubar a arvore, tente novamente.");
        }
    }
}

