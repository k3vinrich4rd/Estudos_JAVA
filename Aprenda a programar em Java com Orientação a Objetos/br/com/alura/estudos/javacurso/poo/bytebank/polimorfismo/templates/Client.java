package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class Client implements Authenticated {

    private final UtilAuthentication utilAuthentication;

    public Client() {
        this.utilAuthentication = new UtilAuthentication();
    }

    @Override
    public void setPassword(int password) {
        this.utilAuthentication.setPassword(password);
    }

    @Override
    public boolean authenticated(int password) {
        return this.utilAuthentication.authenticated(password);

    }
}