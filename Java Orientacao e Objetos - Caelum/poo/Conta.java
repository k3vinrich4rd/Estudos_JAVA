package poo;

public class Conta {
    int number;
    String holder;

    double balance;

    boolean saca(double quantity) {
        if (this.balance < quantity) {
            return false;
        } else {
            this.balance = this.balance - quantity;
            return true;
        }
    }

    void deposita(double quantity) {
        this.balance = +quantity;
    }

    boolean transfere(Conta contaDestino, double quantity) {
        boolean retirou = this.saca(quantity);
        if (!retirou) {
            return false;
        } else {
            contaDestino.deposita(quantity);
            return true;
        }

    }
}

