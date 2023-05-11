package br.com.alura.estudos.javacurso.autoboxingunboxing;

public class AutoBoxingEAutoUnboxingExpresoes {
    public static void main(String[] args) {
        /* Auto-Boxing transforma um tipo primitivo em um objeto
        Exemplos com autoboxing

        Esses exemplos abaixo seria equivalente a uma conversão através
        do método value de cada tipo */

        Short num7 = 1;
        Byte num8 = 10;
        Integer number13 = 100;
        Long num10 = 100L;
        Float num11 = 3.5f;
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b = 'b';

        //Exemplos sem autoboxing

        Short number7 = new Short((short) 1);
        //Outra forma de declarar: Short number7 = (short) 1;
        Byte number8 = new Byte((byte) 10);
        //Outra forma de declarar: Byte number8 = (byte) 10;
        Integer number9 = new Integer(100);
        Long number10 = new Long(10000l);
        Float number11 = new Float(3.5f);
        Double number12 = new Double(3.5555);
        Boolean flag = new Boolean(true);
        Character b1 = new Character('b');
        int num13 = 2;


        number9++;
        System.out.println(number9);
        //auto unboxing num9 -> autoboxing num13/number9 (resultado da divisão)-> number14
        Integer number14 = number9/num13;
        System.out.println(number14);

    }
}