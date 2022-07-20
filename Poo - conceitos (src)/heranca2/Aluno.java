package heranca2;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Efetuando pagamento da mensalidade do aluno " + this.getNome());
        // Caso queira mostrar o nome de outra forma, colocar os atributos da classe mãe protegidos
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
