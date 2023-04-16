package br.com.alura.estudos.javacurso.string;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("Comportamento charAt");
        // charAt -> Indica o valor do índice da sequência de caracteres
        String name1 = "Alura";
        char nameIndex = name1.charAt(2);
        System.out.println(nameIndex + "\n");

        /* Replace → Substitui uma letra em específico do valor declarado
        que é do tipo String, onde é necessário informar no argumento a
        letra que vai ser substituída e a nova letra */
        System.out.println("Comportamento replace");
        String name2 = "Alura";
        String nameReplace = name2.replace("A", "a");
        System.out.println(nameReplace + "\n");

        //toLowerCase → Deixa os caracteres de uma String minúsculos
        System.out.println("Comportamento toLowerCase");
        String name3 = "Alura";
        String toLowerCase = name3.toLowerCase();
        System.out.println(toLowerCase + "\n");

        //Utilizando o replace com char
        System.out.println("Comportamento charReplace");
        String name4 = "Alura";
        String charReplace = name4.replace('A', 'a');
        System.out.println(charReplace + "\n");

        //toUpperCase → Deixa os caracteres de uma String maiúsculos
        System.out.println("Comportamento toUpperCase");
        String name5 = "Alura";
        String toUpperCase = name5.toUpperCase();
        System.out.println(toUpperCase + "\n");

        //indexOf → Você passa uma String em seu argumento e ele retorna a posição da primeira letra da sequência de caracteres informada
        System.out.println("Comportamento indexOf");
        String name6 = "Alura";
        int indexOf = name6.indexOf("ura");
        System.out.println(indexOf + "\n");

        //subString → Você passa o index em seu argumento e ele retorna uma nova String a partir daquele indice
        System.out.println("Comportamento substring");
        String name7 = "Alura";
        String substring = name7.substring(1);
        System.out.println(substring + "\n");

        //length ≥ Mostra o tamanho do valor da String
        System.out.println("Comportamento length");
        String name8 = "casa";
        System.out.println(name8.length() + "\n");

        for(int i = 0; i < name8.length(); i++) {
            System.out.println(name8.charAt(i));
        }
        System.out.println();

        //isEmpty → Verifica se o valor do tipo String esta vazio ou não (Retorna true or false)
        System.out.println("Comportamento isEmpty");
        String vazio = " Alura ";
        String semEspaco = vazio.trim(); // Tira os espaços vazios
        System.out.println(semEspaco.isEmpty() + "\n");

        //trim → Tira os espaços vazios
        System.out.println("Comportamento trim");
        String vazio2 = " Alura ";
        String semEspaco2 = vazio2.trim(); // Tira os espaços vazios
        System.out.println(semEspaco2 + "\n");

        //contains → Se contém alguma sequência de caractere (Retorna true or false)
        System.out.println("Comportamento contains");
        String name10 = "Alura";
        System.out.println(name10.contains("Alu"));
    }
}