public class If {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Você pode comprar bebida alcólica");

        if (!isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Você não pode comprar bebida alcolica");
        }
    }
}
