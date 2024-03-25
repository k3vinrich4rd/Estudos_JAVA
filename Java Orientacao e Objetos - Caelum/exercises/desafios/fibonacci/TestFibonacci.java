package exercises.desafios.fibonacci;

public class TestFibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }

        System.out.println();

        for (int i = 1; i <= 6; i++) {
            int resultado = Fibonacci.calculaFibonacciTernario(i);
            System.out.println(resultado);
        }

    }
}
