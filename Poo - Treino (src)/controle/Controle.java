package controle;

public class Controle {
    String marca;
    String cor;
    boolean ligado = false;

    public Controle() {
        this.marca = marca;
        this.cor = cor;
        this.ligado = ligado;
    }
    public void status(){
        System.out.println("Controle da marca: " + this.marca);
        System.out.println("Da cor: " + this.cor);
    }
    public void ligado(){
        if (this.ligado) {
            System.out.println("Funcionando (ligado)");
        }else {
            System.out.println("Não estou funcionando (desligado)");
        }
    }
    public void desligado (){
        if (!this.ligado){
            System.out.println("Estou desligado");
        }else {
            System.out.println("Estou ligado");
        }
    }


}
