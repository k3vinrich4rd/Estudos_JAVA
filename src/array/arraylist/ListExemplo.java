package array.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExemplo {
    // Declarando um Arraylist (list)
// Array list permite repetição de informação e armazena informação de maneira ordenada
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a sua primeira nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua segunda nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua terceira nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua quarta nota: ");
        notas.add(input.nextDouble());
        input.close();

        System.out.println(notas.get(0)); // Para verificar e a posição da nota
        System.out.println(notas.get(1)); // Para verificar e a posição da nota
        System.out.println(notas.get(2)); // Para verificar e a posição da nota
        System.out.println(notas.get(3)); // Para verificar e a posição da nota
                                            // em que você armazenou na lista


    }

    /*
    Para lista só pode ser um tipo wrapper, Não pode ser primitivo
    A lista é dinâmica não é necessário um número limite
    Não é necessário trabalhar com posições (indices)
    Aceita números repetidos
     */
}
