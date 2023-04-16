package br.com.alura.bytebank.template;
import br.com.alura.bytebank.exception.AuthenticationFailureException;

/**Classe client que implementa uma ‘interface’
 que cuja finalidade é setar a password
 e informar o ‘login’ e password do client
 via uma sobrescrita e composição através
 da classe Authenticated
 @author Kevin Richard*/

public class Client implements Authentication {
    /**Atributo da classe*/
    private String name;

    /**Atributo da classe*/
    private String cpf;

    /**Atributo da classe*/
    private Address address;

    /**Atributo constante da classe (Contém composição*/
    private final AuthenticatedUser AUTHENTICATED_USER;

    /**Construtor da classe*/
    public Client() {
        this.AUTHENTICATED_USER = new AuthenticatedUser();
    }

    /**Construtor da classe*/
    public Client(String name, String cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        // É necessário instanciar o objeto para manipular via referência
        this.AUTHENTICATED_USER = new AuthenticatedUser();
    }

    /**Sobrescrita
     * @param password*/
    @Override
    public void setPasswordUser(int password) {
        this.AUTHENTICATED_USER.setPassword(password); //Composição
    }

    /**Sobrescrita
     * @param login*/
    @Override //Sobrescrita
    public void setLoginUser(String login) {
        this.AUTHENTICATED_USER.setLogin(login); //Composição
    }

    /**Sobrescrita com tratameto de uma possível exceção
     * @param login
     * @param password*/
    @Override
    public boolean authenticatedLoginAndPassword(String login, int password) {
        try {
            this.AUTHENTICATED_USER.firstAuthentication(login, password); //Composição
        } catch (AuthenticationFailureException authenticationFailureException) {
            System.out.println(authenticationFailureException.getMessage());
            return false;
        }
        return true;
    }

    /** Método acessor
     * @return String*/
    public String getName() {
        return this.name;
    }

    /** Método acessor
     * @param name*/
    public void setName(String name) {
        this.name = name;
    }

    /** Método acessor
     * @return String*/
    public String getCpf() {
        return this.cpf;
    }

    /**Método acessor
     * @param cpf*/
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**Método acessor da classe
     * @return Address*/
    public Address getAddress() {
        return this.address;
    }

    /**Método acessor da classe
     * @param address*/
    public void setAddress(Address address) {
        this.address = address;
    }
}