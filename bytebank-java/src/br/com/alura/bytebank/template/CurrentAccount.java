package br.com.alura.bytebank.template;
/** Subclasse (Classe filha)
AccountCurrent é uma classe filha de Account
Onde estende Account através da aplicação do
conceito de herança
 @author Kevin Richard*/
public class CurrentAccount extends Account {

    /**Construtor da subclasse
      utilizando o construtor da super classe*/
    public CurrentAccount() {
        super(); //construtor baseado na classe mãe (Account)
    }

    /**Construtor da subclasse
     utilizando o construtor da super classe*/
    public CurrentAccount(Client holder, double balance, int agency, int number) {
        super(holder, balance, agency, number); //construtor baseado na classe mãe (Account)

    }

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }



    /**polimorfismo do método abstrato de Account
     * @param value*/
    @Override //polimorfismo do método abstrato de Account
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
    }

}