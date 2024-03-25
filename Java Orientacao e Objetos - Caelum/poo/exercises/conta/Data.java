package poo.exercises.conta;

public class Data {

    int dia;
    int mes;
    int ano;

    String formatada() {
        return "Dia: " + this.dia + "\n"
                + "Mês: " + this.mes + "\n"
                + "Ano: " + this.ano;
    }

}
