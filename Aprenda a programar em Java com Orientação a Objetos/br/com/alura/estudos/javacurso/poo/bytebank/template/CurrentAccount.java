
package br.com.alura.estudos.javacurso.poo.bytebank.template;

//Na herança, não se herda construtores
//somente atributos e métodos
public class CurrentAccount extends Account implements Taxable {

    //Com um super(referencia a super classe, que no caso é a classe mãe)
    //Podemos chamar um construtor padrão, mas também podemos chamar um constructor específico
    public CurrentAccount() {
        super(); //construtor baseado na classe mãe (Account)
    }

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    public CurrentAccount(Client holder, double balance, int agency, int number) {
        super(holder, balance, agency, number); //construtor baseado na classe mãe (Account)

    }

    @Override
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit successful");
    }

    @Override //Indica a intenção do dev. De sobrescrever um método
    //E garante que as regras para se fazer uma sobrescrita não sejam quebradas
    public boolean checkOut(double value) {
        double amountToWithdrawWithFee = value + 0.2;
        return super.checkOut(amountToWithdrawWithFee);
    }

    @Override
    public double getValue() {
        return super.balance * 0.01;
    }

    @Override
    public String toString() {
        return "Type account: Current Account " + "\n" +
                super.toString();
    }

    @Override
    public String toString(int agency, int number) {
        return "Type account: Current Account " + "\n"
                + super.toString(agency, number);
    }

    @Override
    public String toString(Client holder, double balance) {
        return "Type account: Current Account " + "\n" +
                super.toString(holder, balance);
    }

    @Override
    public String toString(Client holder) {
        return "Type account: Current Account " + "\n"
                + super.toString(holder);
    }
}