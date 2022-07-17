package estudante2;

public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Kevin Richard";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Felipe";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        impressora.impressora(estudante);
        System.out.println();
        impressora.impressora(estudante2);
    }
}
