package canetaguanabara2;

public class Caneta {
    public String modelo; // Atributos
    public String cor; // Atributos
    public double ponta; // Atributos
    public int carga; // Atributos
    public boolean tampada; // Atributos


    public void statusCaneta() {
        System.out.println();
        System.out.println("-------- Informações sobre a caneta: --------");
        System.out.println("A caneta do modelo: " + this.modelo + "\nDe cor: " + this.cor
                + "\nCom a numeração de ponta: " + this.ponta + "\nCom carga: " + this.carga + "%");


    }

    // Método
    public void tampar() {
        this.tampada = true;
        System.out.println("A sua caneta está tampada");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("A sua caneta está destampada");
    }

    //Método
    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Erro, não posso rabiscar... destampe a caneta");
        } else {
            System.out.println("Rabiscando");
            System.out.println();

        }
    }


}
