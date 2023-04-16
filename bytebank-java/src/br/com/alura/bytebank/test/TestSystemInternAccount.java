package br.com.alura.bytebank.test;


import br.com.alura.bytebank.template.Address;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.SystemIntern;

//Classe criada para testar os comportamentos do sistema interno
public class TestSystemInternAccount {
    public static void main(String[] args) {

        //Instanciando uma variável e um objeto Address, acessando e manipulando seus comportamentos
        Address address = new Address("Rua Tim Maia", 333,
                "Jd musical", "Osasco", "São paulo",
                "0000-000", "Casa");

        //Instanciando uma variável e um objeto Client, acessando e manipulando seus comportamentos
        Client timMaia = new Client("Tim maia", "000.000.000-00", address);
        timMaia.setLoginUser("bom s");
        timMaia.setPasswordUser(11);
        //Instanciando uma variável e um objeto SystemInter, acessando e manipulando seus comportamentos
        SystemIntern systemIntern = new SystemIntern();
        systemIntern.authentication(timMaia, "bom s", 111);
    }
}