package br.com.alura.testeautomatizados.test;

import br.com.alura.testeautomatizados.templates.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {


    /* Testes são divididos em três partes
        * Cénario * O Esperado * O resultado */
    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int sum = calculadora.sum(3, 7);

        Assertions.assertEquals(10, sum); //Susbtitui o System.out
    }
}

/* Usando o jUnit é bem mais prático, pois se tem uma resposta mais
visual, e os cenários de testes ficam mais segregados
 */