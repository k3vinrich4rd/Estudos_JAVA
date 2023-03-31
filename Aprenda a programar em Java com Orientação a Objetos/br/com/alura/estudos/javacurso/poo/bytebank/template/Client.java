package br.com.alura.estudos.javacurso.poo.bytebank.template;

public class Client {
    private String name;
    private String cpf;
    private String profession;
    private static int clientsTotal;

    public Client(String name, String cpf, String profession) {
        //Incrementa a quantidade de clients
        Client.clientsTotal++;
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;

    }

    public Client() {
        //Incrementa a quantidade de clients
        Client.clientsTotal++;
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

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static int getClientsTotal(){
        return Client.clientsTotal;
    }
}