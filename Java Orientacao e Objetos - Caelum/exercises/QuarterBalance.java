package exercises;
/*
1. Na empresa em que	trabalhamos, há	tabelas	com	o gasto	de cada	mês. Para fechar o balanço do
primeiro trimestre, precisamos somar o gasto total.	Sabendo que, em	janeiro, foram gastos 15 mil
reais, em fevereiro,23	mil	reais	e,	em	março,	17	mil	reais, faça um	programa que calcule
e imprima a despesa total no trimestre e a média mensal de gastos
 */
public class QuarterBalance {
    public static void main(String[] args) {

        int spendingJanuary = 15000;
        int spendingFebruary = 23000;
        int spendingMarch = 17000;
        int quarterExpense = spendingJanuary + spendingFebruary + spendingMarch;
        int averageMonthlyExpenses =  quarterExpense / 3;

        System.out.println("Quarter Expense: R$" + quarterExpense);
        System.out.println("Average Monthly Expenses: R$" + averageMonthlyExpenses);

    }
}
