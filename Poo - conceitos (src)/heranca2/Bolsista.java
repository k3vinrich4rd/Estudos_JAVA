package heranca2;

public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }


    public void renovarBolsa() {
        System.out.println("Efetuando a renovação da bolsa de estudos da(o) aluno(a) " + this.getNome());
    }


    @Override //Sobreposição (polimorfismo)
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado");
    }
}
