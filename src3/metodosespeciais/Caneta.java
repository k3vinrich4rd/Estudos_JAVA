package metodosespeciais;

public class Caneta {
    public String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, double ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
        this.destampada();

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }

    public void destampada(){
        this.tampada = false;

    }

    public void status(){
        System.out.println("Informações sobre a caneta: " +"\nModelo: " + this.getModelo()
        + "\nPonta: " + this.getPonta() + "\nDa cor: " + this.cor + "\nTampada: " + this.tampada);
    }
}
