package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;

import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Administrador;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Manager;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.SystemIntern;

public class TestSystemIntern {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(2222);

        Administrador administrador = new Administrador();
        administrador.setPassword(2324);

        SystemIntern systemIntern = new SystemIntern();
        systemIntern.authenticated(manager);
        systemIntern.authenticated(administrador);

    }
}