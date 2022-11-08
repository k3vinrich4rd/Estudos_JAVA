package lampada;

public class Lampada {
    String tipoDeLuz;
    double potenciaEmWatz;
    String marca;
    String cor;
    double preco;
    boolean ligada;

    public void ligarLampada(){
        if (ligada){
            System.out.println("A sua lâmpada está ligada");
        }else {
            System.out.println("Erro, lâmpada desligada");
        }
    }
    public void desligarLampada(){
        if(!ligada){
            System.out.println("A sua lâmpada está desligada");
        }else {
            System.out.println("Erro lâmpada ligada");
        }
    }

}
