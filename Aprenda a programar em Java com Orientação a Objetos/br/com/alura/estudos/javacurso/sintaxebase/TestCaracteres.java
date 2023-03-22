package br.com.alura.estudos.javacurso.sintaxebase;

//tipo char guarda apenas um caractere da tabela unicode
public class TestCaracteres {
    public static void main(String[] args) {
        char letter = 'k';
        System.out.println(letter);

        char value = 65; //Char é um número convertido
        System.out.println(value);

        //fazendo um casting para somar um valor inteiro ao char
        value = (char) (value + 1);
        System.out.println(value);

        //Outra forma de fazer a mesma coisa
        value += 1;
        System.out.println(value);

        String palavra = "Kevin Richard, futuro desenvolvedor especialista ano: " + 2026;
        System.out.println(palavra); //Como string é um tipo referencia (Objeto)
        // Quando se soma um valor a variável ele converte
    }

}