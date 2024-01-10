package testeautomatizados.test;


import testeautomatizados.templates.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {


    /* Testes são divididos em três partes
        * Cenário * O Esperado * O resultado */
    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int sum = calculadora.sum(3, 7);

        Assertions.assertEquals(10, sum); //Substitui o System.out
    }
}

/* Usando o jUnit é bem mais prático, pois se tem uma resposta mais
visual, e os cenários de testes ficam mais segregados
 */