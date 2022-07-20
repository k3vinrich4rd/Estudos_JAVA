package herança;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno() {
        super();
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("A sua matrícula será cancelada ");
    }

    @Override
    public void fazerAniversario() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
