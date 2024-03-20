package poo;

public class Conta {
    int number;
    String holder;

    double balance;

    boolean saca(double quantity) {
       if (this.balance < quantity ) {
           return false;
       } else  {
         this.balance = this.balance - quantity;
           return true;
       }
    }

    void deposita(double quantity) {
        this.balance =+ quantity;
    }
}

