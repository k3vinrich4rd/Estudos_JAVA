package livro;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nome = "Capitães De Areia";
        livro1.autor = "Jorge amado";
        livro1.anoDeLancamento = 1937;
        livro1.quantidadeDePaginas = 342;
        livro1.genero = "Romance e ficção";
        livro1.editora = "José Olympio";
        livro1.isbn = 13.9788535914061;

        Livraria livroLivraria = new Livraria();
        livroLivraria.nome = "Revolução dos bichos";
        livroLivraria.autor = "George Orwell";
        livroLivraria.anoDeLancamento = 1945;
        livroLivraria.quantidadeDePaginas = 112;
        livroLivraria.genero = "Sátira Politica";
        livroLivraria.editora = "Aleph";
        livroLivraria.preco = 9.90;
        livroLivraria.isbn = 658.6029651;

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.nome = "As vantagens de ser invisível";
        livroBiblioteca.autor = "Stephen Chbosky";
        livroBiblioteca.anoDeLancamento = 1999;
        livroBiblioteca.quantidadeDePaginas = 224;
        livroBiblioteca.genero = "Romance e Ficção Juvenil";
        livroBiblioteca.editora = "Rocco";
        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.emprestadoA = "Kevin Richard";

    }

}
