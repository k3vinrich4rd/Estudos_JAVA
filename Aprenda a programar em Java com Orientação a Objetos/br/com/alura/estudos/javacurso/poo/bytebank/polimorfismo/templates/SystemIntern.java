package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class SystemIntern {

    public int password = 2222;

    public void authenticated(Authenticated authenticated) {
        boolean authentic = authenticated.authenticated(this.password);
        if (!authentic) {
            System.out.println("Cannot enter the system");
        } else {
            System.out.println("Can enter the system");
        }
    }
}