package herança;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario() {
        super();
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    @Override
    public void fazerAniversario() {

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


}
