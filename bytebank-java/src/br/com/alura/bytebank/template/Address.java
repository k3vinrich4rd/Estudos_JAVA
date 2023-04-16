package br.com.alura.bytebank.template;
/** Classe Address, utilizada como composição na classe client
 sendo assim para um client existir, depende de endereço e vice-versa
 * @author Kevin Richard*/
public class Address {

    /**Atributo da classe*/
    private String publicPlace;
    /**Atributo da classe*/
    private int number;
    /**Atributo da classe*/
    private String neighborhood;
    /**Atributo da classe*/
    private String city;
    /**Atributo da classe*/
    private String state;
    /**Atributo da classe*/
    private String cep;
    /**Atributo da classe*/
    private String complement;

    /**Construtor da classe*/
    public Address() {

    }

    /**Construtor da classe*/
    public Address(String publicPlace,
                   int number,
                   String neighborhood,
                   String city,
                   String state,
                   String cep,
                   String complement) {
        this.publicPlace = publicPlace;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.complement = complement;
    }

    /**Método acessor da classe
     * @return String*/
    public String getPublicPlace() {
        return publicPlace;
    }

    /**Método acessor da classe
     * @param publicPlace*/
    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    /**Método acessor da classe
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**Método acessor da classe
     * @param number*/
    public void setNumber(int number) {
        this.number = number;
    }

    /** Método acessor da classe
     *  @return String*/
    public String getNeighborhood() {
        return neighborhood;
    }

    /**Método acessor da classe
     * @param neighborhood*/
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /** Método acessor da classe
     *  @return String*/
    public String getCity() {
        return city;
    }

    /**Método acessor da classe
     * @param city*/
    public void setCity(String city) {
        this.city = city;
    }

    /** Método acessor da classe
     *  @return String*/
    public String getState() {
        return state;
    }

    /**Método acessor da classe
     * @param state*/
    public void setState(String state) {
        this.state = state;
    }

    /** Método acessor da classe
     *  @return String*/
    public String getCep() {
        return cep;
    }

    /**Método acessor da classe
     * @param cep*/
    public void setCep(String cep) {
        this.cep = cep;
    }

    /** Método acessor da classe
     *  @return String*/
    public String getComplement() {
        return complement;
    }

    /**Método acessor da classe
     * @param complement*/
    public void setComplement(String complement) {
        this.complement = complement;
    }
}