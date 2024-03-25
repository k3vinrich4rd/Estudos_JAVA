package poo.exercises.casa;

public class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.cor = "Vermelho";
        casa.porta1 = false;
        casa.porta2 = false;
        casa.porta3 = false;
        
        casa.pinta("Azul");
        System.out.println("A cor da casa é: " + casa.cor);
        System.out.println("A casa esta com " + casa.quantasPortasEstaoAbertas() + " porta(s) abertas");
    }
}
