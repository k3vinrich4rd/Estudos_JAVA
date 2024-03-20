package exercises;

//2. Imprima a soma	de 1 até 1000.
public class MultiploDeTresFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
