package polimorfismosobrecarga;

public class Cachorro extends Lobo{
    public Cachorro(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase){
        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("olá")){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if (hora <12) {
            System.out.println("Abanar");
        } else if (hora > 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, double peso){
        if (peso < 10){
            System.out.println("Rosnar");
        }else {
            System.out.println("Ignorar");
        }
    }
}
