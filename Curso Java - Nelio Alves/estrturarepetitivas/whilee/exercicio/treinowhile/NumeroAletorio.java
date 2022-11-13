package estrturarepetitivas.whilee.exercicio.treinowhile;

import java.util.Random;

public class NumeroAletorio {
    public static void main(String [] args){
        Random randomGenerate = new Random();
        int number = 1 + randomGenerate.nextInt(10);
        while (number != 3){
            System.out.println("Generate the number " + number);
            number = 1 + randomGenerate.nextInt(10);
        }
        System.out.println("Generate the number three!!!!");
    }
}
