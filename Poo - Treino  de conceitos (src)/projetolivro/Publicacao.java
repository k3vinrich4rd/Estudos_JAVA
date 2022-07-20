package projetolivro;

public interface Publicacao {
    public void abrir();

    public void fechar();

    public void folhear(int atePagina);
    public void avancarPagina();

    public void voltarPagina();

}
