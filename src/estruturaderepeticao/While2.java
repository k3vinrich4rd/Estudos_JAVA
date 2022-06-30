package estruturaderepeticao;

// Utilizando o while (Enquanto) para mudar o fluxo de um código utilizando o continue (continuar)
public class While2 {
    public static void main(String[] args) {
        int contador = 0; // começo + 1
        while (contador < 10) { // fim
            contador++; // = contador = contador + 1
            if (contador == 5 || contador == 7) { // Vai mostrar as cambalhotas, menos a 5 e 7
                continue; // Vai mostrar as cambalhotas, menos a 5 e 7
            }
            System.out.println("Cambalhota " + contador);
        }

    }
}

