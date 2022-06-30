package estruturadecondicao;

public class If { // Utilizando a estrutura If (Se) com um conectivo lógico (! = negação)
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Você pode comprar bebida alcólica");

        if (!isAutorizadoComprarBebidaAlcolica) { // ! = negação)
            System.out.println("Você não pode comprar bebida alcolica");
        }
    }
}
