package canetaguanabara2;

public class Caneta2 {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("----- Informações sobre a caneta -----");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("Carga: " + this.carga + "% de tinta");
        System.out.println("Está tampada? " + this.tampada);

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void escrever() {
        if (this.tampada) {
            System.out.println("Impossivel escrever, a caneta está tampada");
        } else {
            System.out.println("A caneta está escrevendo\n");
        }
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Impossivel efetuar está ação, destampe a caneta");
        } else {
            System.out.println("A caneta está rabiscando\n");
        }
    }

    public void pintar() {
        if (this.tampada) {
            System.out.println("Impossivel efetuar a pintura, destampe a caneta ");
        } else {
            System.out.println("A caneta está pitando\n");
        }

    }


}


