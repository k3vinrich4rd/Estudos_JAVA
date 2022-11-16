package poo.membrosestaticos.exerciciodefixacao;
// conversor de moeda
public class CurrencyConverter {
    public static double priceDollar; //preçoDollar
    public static double amountOfDollarsPurchased; //quantidadeDeDólaresComprados

    public static double amountToBePaidInReais() { //ValorASerPagoEmReais
        double percentage = priceDollar * amountOfDollarsPurchased * 0.06;
        return percentage + (priceDollar * amountOfDollarsPurchased);
    }


}
