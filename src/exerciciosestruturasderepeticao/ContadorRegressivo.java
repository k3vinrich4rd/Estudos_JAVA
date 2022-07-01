package exerciciosestruturasderepeticao;
// Utilizando a estrutura for (Para) para contar de 15 até 5, de 2 em 2 a cada ciclo
public class ContadorRegressivo {
    public static void main(String[] args) {
        for (int i = 15; i >= 5 ; i-= 2) {
            System.out.println(i);
        }
    }
}

/* o código acima, seria a mesma coisa que:
int contador = 15;
while (contador >= 15) {
    System.out.println("Cambalhota");
    contador -= 2;
}
 */
