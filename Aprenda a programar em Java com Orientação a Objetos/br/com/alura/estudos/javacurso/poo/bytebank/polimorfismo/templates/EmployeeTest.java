package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

public class EmployeeTest {

    private String name;
    private String cpf;
    private double salary;

    private int type = 0; // type = 0 Employee / type = 1 Manager

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double bonus() {
        if (type == 0) {
            return this.salary * 0.1;
        } else if (type == 1) {
            return this.salary;
        } else {
            return this.salary + 1000.0;
        }
    }
}