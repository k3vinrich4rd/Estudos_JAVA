package estruturaderepeticao;
/*
While (Enquanto) definição:
O termo while pode ser traduzido para o português como ?enquanto?.
Este termo é utilizado para construir uma estrutura de repetição que executa, repetidamente, uma única instrução ou um bloco delas ?enquanto?
uma expressão booleana for verdadeira.
 */

// Contando a quantidade de cambalhotas utilizando a estrutura de repetição while (Enquanto)
public class While {
    public static void main(String[] args) {
        int contadorCambalhota = 0;
        int contador = 0; // começo
        // Estrutura de repetição:
        while (contador < 4) { // fim
            System.out.println((contador + 1) +" º Cambalhota");
            contador++;
            contadorCambalhota += 1;
        }
        System.out.println("Você deu: " + contadorCambalhota + " cambalhotas");
        }
    }
