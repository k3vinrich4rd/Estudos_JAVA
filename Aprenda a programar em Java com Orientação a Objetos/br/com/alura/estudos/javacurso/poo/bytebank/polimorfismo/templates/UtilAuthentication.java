package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class UtilAuthentication {
    /*
    Explicação: Deixando o código de autenticação somente aqui
    o código fica bem mais coeso e também
     */
    int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticated(int password) {
        if (this.password != password) {
            System.out.println("Access denied");
            return false;
        }
        System.out.println("Access granted");
        return true;
    }
}