package br.com.alura.testeautomatizados.test;

import br.com.alura.testeautomatizados.templates.Calculadora;

//Uma maneira de se escrever um teste automatizado
/*Mas dessa maneira não está muito legal por conta da sua grandeza e extensão
Outros pontos também são:
 * Para testar o teste tenho que dar "run"
 * Não se tem um feedback preciso (Depende sempre de olhar os logs)
 * Não aponta exatamente se está ok ou não
 * Exige muito de quem está testando e pode causar possível erros humanos
 */
public class CalculadoraTestComOMetodoMain {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int sum = calculadora.sum(3, 7);
        System.out.println(sum);

        sum = calculadora.sum(3, 0);
        System.out.println(sum);

        sum = calculadora.sum(0, 0);
        System.out.println(sum);

        sum = calculadora.sum(3, -1);
        System.out.println(sum);
    }
}
