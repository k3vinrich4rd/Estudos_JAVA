package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class ManagerComSobrecarga extends Employee {
    private int password;
    private String login;

    public ManagerComSobrecarga() {

    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    //sobrecarga com retorno
    public boolean authenticated(int password) {
        if (this.password != password) {
            System.out.println("Access denied");
            return false;
        }
        System.out.println("Access granted");
        return true;
    }

    //Sobrecarga sem retorno
    public void authenticated(String login, int password) {
        if (!this.login.equalsIgnoreCase(login) && this.password != password) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    @Override
    public double bonus() {
        return super.getSalary();
    }
}
