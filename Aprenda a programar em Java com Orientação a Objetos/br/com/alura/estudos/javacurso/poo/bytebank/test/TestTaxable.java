import br.com.alura.estudos.javacurso.poo.bytebank.template.AccountCurrent;
import br.com.alura.estudos.javacurso.poo.bytebank.template.LifeInsurance;
import br.com.alura.estudos.javacurso.poo.bytebank.template.TaxCalculator;

public class TestTaxable {
    public static void main(String[] args) {

        AccountCurrent accountCurrent = new AccountCurrent(222, 333);
        accountCurrent.depositInAccount(100);

        LifeInsurance lifeInsurance = new LifeInsurance();
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.registerTaxable(accountCurrent);
        taxCalculator.registerTaxable(lifeInsurance);
        System.out.println(taxCalculator.getTotalTaxLevied());

    }
}