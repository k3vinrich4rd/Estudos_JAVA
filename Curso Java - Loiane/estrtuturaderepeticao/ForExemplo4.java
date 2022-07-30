package estrtuturaderepeticao;

//loop sem corpo - exemplo:
public class ForExemplo4 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é: " + soma);
        }
    }
}
