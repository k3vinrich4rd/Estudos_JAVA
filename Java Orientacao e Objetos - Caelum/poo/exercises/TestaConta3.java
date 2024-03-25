package poo.exercises;

public class TestaConta3 {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.titular = "Kevin Richard";
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2 = c1;


        if (c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
