
package br.com.alura.estudos.javacurso.poo.bytebank.template;

//Na herança, não se herda construtores
//somente atributos e métodos
public class AccountCurrent extends Account implements Taxable {

    //Com um super(referencia a super classe, que no caso é a classe mãe)
    //Podemos chamar um construtor padrão, mas também podemos chamar um constructor específico
    public AccountCurrent() {

    }

    @Override
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit successful");
    }

    public AccountCurrent(int agency, int number) {
        super(agency, number);
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
}