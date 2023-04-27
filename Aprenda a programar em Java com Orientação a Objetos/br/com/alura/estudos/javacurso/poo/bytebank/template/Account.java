package br.com.alura.estudos.javacurso.poo.bytebank.template;

public abstract class Account {
    protected double balance;
    private int agency;
    private int number;
    private Client holder; //Composição/Referência a client
    //O valor default de um tipo referência é null
    private static int total; //Static significa que o atributo pertence à classe
    // e não é um atributo de instância

    public Account() {
        Account.total++;
    }

    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
        Account.total++;
    }

    //Construtor
    public Account(Client holder, double balance, int agency, int number) {
        this.holder = holder;
        this.balance = balance;
        this.agency = agency;
        this.number = number;
        Account.total++;
    }

    public Account(Client holder, double balance) {
        this.holder = holder;
        this.balance = balance;
        this.agency = 1;
        this.number = 1;
        Account.total++;
    }

    public Account(Client holder) {
        this.holder = holder;
        Account.total++;
    }


    public abstract void depositInAccount(double value);


    public boolean checkOut(double value) {
        if (this.balance < value || this.balance == 0.0) {
            System.out.println("Impossible to withdraw");
            return false;
        } //else {
        this.balance -= value;
        System.out.println("Successful withdraw");
        return true;
        //}
    }

    public boolean transfer(double value, Account accountDestiny) {
        if (this.balance < value || this.balance == 0.0) {
            System.out.println("Impossible to transfer");
            return false;
        } // else {
        //o checkout aqui faz a mesma coisa
        this.checkOut(value);  // equivalente a  this.balance -= value;
        //Chama o método referente a classe/objeto que vai utilizar
        accountDestiny.depositInAccount(value); //Aqui se emprega a mesma coisa
        System.out.println("Successful transfer");
        return true;
        // }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0) {
            System.out.println("Numbers in the agency field cannot be negative or equal to zero");
            return; //Para não executar a linha abaixo e para a execução da aplicação caso caia
            //Nesta condição estabelecida
        }
        this.agency = agency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println("Account numbers cannot be negative or equal to zero");
            return;
        }
        this.number = number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getTotal() {
        return Account.total;
    }

    @Override
    public boolean equals(Object conta) { // Como equals recebe um Object em seu parâmetro
        Account contaDeReferencia = (Account) conta; //É necessário fazer um type cast. Para acessar
        // os valores necessários para se fazer a comparação que regra de negócio exige
        return this.agency == contaDeReferencia.agency &&
                this.number == contaDeReferencia.number;
    }


    @Override
    public String toString() {
        return
                "Holder: " + holder + "\n" +
                        "Balance in account: " + balance + "\n" +
                        "Agency: " + agency + "\n" +
                        "Number account: " + number;
    }

    //Sobrecarga toString
    public String toString(int agency, int number) {
        return
                "Agency: " + agency + "\n" +
                        "Number account: " + number;
    }


    public String toString(Client holder, double balance) {
        return
                "Holder: " + holder + "\n" +
                        "Balance in account: " + balance;
    }

    public String toString(Client holder) {
        return "Holder: " + holder;
    }
}