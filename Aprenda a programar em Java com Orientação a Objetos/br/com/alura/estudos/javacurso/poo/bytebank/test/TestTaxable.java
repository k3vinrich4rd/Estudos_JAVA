import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.LifeInsurance;
import br.com.alura.estudos.javacurso.poo.bytebank.template.TaxCalculator;

public class TestTaxable {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(222, 333);
        currentAccount.depositInAccount(100);

        LifeInsurance lifeInsurance = new LifeInsurance();
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.registerTaxable(currentAccount);
        taxCalculator.registerTaxable(lifeInsurance);
        System.out.println(taxCalculator.getTotalTaxLevied());

    }
}