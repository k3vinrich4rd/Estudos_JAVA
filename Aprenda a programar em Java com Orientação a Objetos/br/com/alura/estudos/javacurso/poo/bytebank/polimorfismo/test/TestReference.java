package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;

import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Employee;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Manager;

public class TestReference {
    public static void main(String[] args) {

        /* É possível instanciar uma referência do tipo progenitora para instanciar um objeto filha,
        mas ao fazer o acesso aos métodos definidos na classe Manager, ficam inacessíveis por conta que
        a classe mãe não tem acesso a esses comportamentos e membros (Pois o Funcionário (Classe progenitora)
        É o tipo mais genérico de instância, pois é a base de criação para manager (class base), limitada a
        chamar somente comportamento contidos na sua própria classe*/

        //O tipo da referência: Employee manager
        //Pode ser mutável para um tipo mais genérico (Classe progenitora)
        // Ou do mesmo tipo que seu objeto
        //Isso se chama polimorfismo

        Employee manager = new Manager();
        manager.setName("Kevin Richard");
        //manager.authenticated(); exemplo do erro
        String name = manager.getName();
        System.out.println(name);
    }
}