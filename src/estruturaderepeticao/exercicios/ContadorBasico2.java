package estruturaderepeticao.exercicios;

public class ContadorBasico2 {
    public static void main(String[] args) {
        int contador = 0; // caso esse número for maior que dez, ele não executa
        while (contador < 10) { // Só vai executar se o resultado do contador for verdadeiro
            System.out.println(++contador);
        }
    }
}
