package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class Administrador extends Employee implements Authenticated {
    /*
   /Indica um relacionamento de composição, onde uma classe/objeto
   é composta por outra classe, conseguindo fazer
    */
    private final UtilAuthentication utilAuthentication;

    public Administrador() {

        this.utilAuthentication = new UtilAuthentication();
    }

    @Override
    public double bonus() {
        return 50;
    }

    @Override
    //reutilizando de código com composição
    public void setPassword(int password) {
        this.utilAuthentication.setPassword(password); //Composição
    }

    @Override
    //reutilizando de código com composição
    public boolean authenticated(int password) {
        return this.utilAuthentication.authenticated(password); //Composição
    }
}