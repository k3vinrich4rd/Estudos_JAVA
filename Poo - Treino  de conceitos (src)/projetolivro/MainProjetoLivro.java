package projetolivro;

public class MainProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[2];

        pessoas[0] = new Pessoa("Kevin Richard", 19, "Masculino");
        pessoas[1] = new Pessoa("Ketelyn Mayara", 23, "Feminino");

        livros[0] = new Livro("Revolução dos Bichos", "George Orwell", 112, pessoas[0]);
        livros[1] = new Livro("Pequeno Manual Anti racista", "Djamila Riveiro", 136, pessoas[1]);


        livros[0].abrir();
        livros[0].folhear(20);
        livros[0].avancarPagina();
        System.out.println(livros[0].detalhes());


    }
}
