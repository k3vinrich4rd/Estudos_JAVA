package estrturarepetitivas.fori.testedemesafori;

public class Teste1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;

        for (int i = 0; i < x; i++) {
            y += 5;
            System.out.println(i + "," + y);
        }
    }
}
