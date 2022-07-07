package pessoa;

public class Main {
    public static void main(String[] args) {
        // Objeto
        Estudante estudante = new Estudante(); // Novo objeto
        estudante.nome = "Kevin Richard"; // Atributos do objeto
        estudante.idade = 20; // Atributos do objeto
        estudante.sexo = 'M'; // Atributos do objeto

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
