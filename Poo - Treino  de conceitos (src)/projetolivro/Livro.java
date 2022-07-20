package projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return
                "Titulo do livro: " + titulo +
                        "\nAutor(a): " + autor +
                        "\nTotal de páginas: " + totalDePaginas +
                        "\nPágina atual: " + paginaAtual +
                        "\nO livro está aberto? " + aberto +
                        "\nLeitor: " + leitor.getNome() +
                        "\nIdade: " + leitor.getIdade() + " anos" +
                        "\nGênero: " + leitor.getSexo();

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int atePagina) {
        if (atePagina > totalDePaginas){
            this.totalDePaginas = 0;

        }else {
            this.paginaAtual = atePagina;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
        // outra forma: this.paginaAtual = this.paginaAtual + 1
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
        // outra forma: this.paginaAtual = this.paginaAtual - 1
    }
}
