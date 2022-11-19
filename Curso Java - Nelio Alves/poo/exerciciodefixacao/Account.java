package poo.exerciciodefixacao;

public class Account {

    private int number; // Número da conta

    private String holder; //Proprietário(a)

    private double balance; // Saldo em conta


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
        /*
        Para evitar mudanças duplas, pois se a regra de negócio mudar, o construtor fica intacto
        e só será necessário mudar o método de depósito inicial, pois não estamos informando o valor do saldo,
        mas sim de depósito inicial (pois a conta nova tem um saldo zero

       Isso também é um caso de encapsulamento, pois estamos encapsulando a regra de negócio no método
       protegendo somente um ponto de alteração
         */
    }

    public String toString() {
        return
                "Account " + getNumber()
                        + ", "
                        + "Holder: " + getHolder()
                        + "," + " Balance: $ "
                        + String.format("%.2f", getBalance());
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) { //Deposito
        balance += amount; // or this.balance
    }

    public void withDraw(double amount) { //Saque
        balance -= amount + 5.0; // A quantia a ser sacada mais 5 (Que é o valor da taxa)
        // or this.balance
    }
}








