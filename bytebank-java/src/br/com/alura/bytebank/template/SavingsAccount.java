package br.com.alura.bytebank.template;
/** Subclasse (Classe filha)
AccountCurrent é uma classe filha de Account
Onde estende Account através da aplicação do
conceito de herança
 @author Kevin Richard
 */
public class SavingsAccount extends Account {

    /**Construtor da subclasse
     utilizando o construtor da super classe*/
    public SavingsAccount() {
        super();
    }

    /**Construtor da subclasse
     utilizando o construtor da super classe*/
    public SavingsAccount(Client client, double balance, int agency, int number) {
        super(client, balance, agency, number); //construtor baseado na classe mãe (Account)
    }

    /**Construtor da subclasse
     utilizando o construtor da super classe*/
    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    /**polimorfismo do método abstrato de Account
     * @param value*/
    @Override
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
    }
}