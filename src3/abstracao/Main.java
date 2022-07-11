package abstracao;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.obterSaldo(1500, 800);

        Colaborador colaborador = new Colaborador();
        colaborador.calcularSalario(15000, 2500);
    }
}
