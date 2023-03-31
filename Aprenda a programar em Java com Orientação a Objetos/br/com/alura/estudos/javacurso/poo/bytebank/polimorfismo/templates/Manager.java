package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class Manager extends Employee implements Authenticated {

    private final UtilAuthentication authentication;

    public Manager() {
        //Referenciando o atributo de util Authentication
        this.authentication = new UtilAuthentication();
    }

    @Override
    public double bonus() {
        return super.getSalary();

    }

    @Override
    //reutilizando de código com composição
    //e delegando a chamada
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }

    @Override
    //reutilizando de código com composição
    public boolean authenticated(int password) {
        return this.authentication.authenticated(password);
    }
}