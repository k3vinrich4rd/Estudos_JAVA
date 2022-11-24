package enumeracoescomposicoes.exercicioresolvido1;

import java.util.Date;

public class HourContract { //Horas Contrato
    private Date date; //Data
    private Double valuePerHour; //Valor por hora
    private Integer hours; //Horas

    public HourContract() {

    }

    public HourContract(Date date, Double valuePerHour, Integer hours) { //Horas contrato
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() { //Valor total
        return valuePerHour * hours;
    }
}
