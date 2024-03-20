package exercises;


public class FatorialLong {
    public static void main(String[] args) {

        long fatorial = 1;
        for (long n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("fat(" + n + ")	=	" + fatorial);
        }
    }
}
