package operadorternario;

public class OperadorTernario2 { // Utilizando operador ternário com String (Corda)
    public static void main(String[] args) {
        double salario = 6000;
        String doar = "Vou doar 500 R$, para instituição Kevin Richard";
        String naoDoar = "Não vou doar para instituição Kevin Richard";
        String resultado = salario > 5000 ? doar : naoDoar;

        System.out.println(resultado);
    }
}
