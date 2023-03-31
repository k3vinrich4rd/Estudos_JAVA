package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

//Super class
public abstract class Employee {

    private String name;
    private String cpf;
    private double salary;

    public Employee() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Método sem escopo
    public abstract double bonus();
}