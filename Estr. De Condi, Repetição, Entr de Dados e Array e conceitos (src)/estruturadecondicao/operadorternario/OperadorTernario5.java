package estruturadecondicao.operadorternario;
// Utilizando operador tern�rio
public class OperadorTernario5 {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1: preco * 0.05;

        System.out.println(desconto);
    }
}
