package br.com.alura.estudos.javacurso.poo.bytebank.template;

public class AccountSavings extends Account {

    public AccountSavings() {

    }

    @Override
    public void depositInAccount(double value) {
        this.balance += value;
        System.out.println("Deposit successful");
    }

    public AccountSavings(double balance, int agency, int number, Client holder) {
        super(balance, agency, number, holder);
    }

    public AccountSavings(int agency, int number) {
        super(agency, number);
    }
}