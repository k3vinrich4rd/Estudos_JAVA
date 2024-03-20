package exercises;

//2. Imprima a soma	de 1 até 1000.
public class FatorialInt {
    public static void main(String[] args) {

        int fatorial = 1;
        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("fat(" + n + ")	=	" + fatorial);
        }
    }
}
