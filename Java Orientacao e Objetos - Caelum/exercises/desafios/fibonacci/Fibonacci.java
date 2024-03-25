package exercises.desafios.fibonacci;

public class Fibonacci {

    public int calculaFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        }
    }

    public static int calculaFibonacciTernario(int n) {
        return (n <= 2) ? 1 : calculaFibonacciTernario(n - 1) + calculaFibonacciTernario(n -2);
    }

}
