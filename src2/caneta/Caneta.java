package caneta;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga );
        System.out.println("Est� tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO!, n�o posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public  void destampar(){
        this.tampada = false;
    }
}
