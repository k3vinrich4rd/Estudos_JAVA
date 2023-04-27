package br.com.alura.estudos.javacurso.poo.bytebank.template;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super(); //construtor baseado na classe mãe (Account)
    }

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    public SavingsAccount(Client client, double balance, int agency, int number) {
        super(client, balance, agency, number); //construtor baseado na classe mãe (Account)
    }

    @Override //polimorfismo do método abstrato de Account
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
    }

    @Override
    public String toString() {
        return "Type account: Savings Account " + "\n" +
                super.toString();
    }

    @Override
    public String toString(int agency, int number) {
        return "Type account: Savings Account " + "\n"
                + super.toString(agency, number);
    }

    @Override
    public String toString(Client holder, double balance) {
        return "Type account: Savings Account " + "\n" +
                super.toString(holder, balance);
    }

    @Override
    public String toString(Client holder) {
        return "Type account: Savings Account " + "\n"
                + super.toString(holder);
    }
}