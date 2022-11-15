package funcoesstring;

public class ManipulandoString {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s01 = original.toLowerCase();// (toLoweCase = para minúsculas) Deixa as letras minúsculas
        String s02 = original.toUpperCase();// (toUpperCase = para maiúsculas) Deixa as letras maiúsculas
        String s03 = original.trim();// (trim = aparar) Elimina os espaços nos cantos da string
        String s04 = original.substring(2);// forma uma nova string a partir do indice informado no parâmetro
        String s05 = original.substring(2, 9);// forma uma nova string a partir do indice informado no parâmetro
        String s06 = original.replace('a', 'x');//replace = substituir (troca o oldChar pelo newChar)
        String s07 = original.replace("abc", "xy");//replace = substituir (troca o oldChar pelo newChar)
        int i = original.indexOf("bc"); //Revela a posição inicial do indice da string
        int j = original.lastIndexOf("bc"); // Revela a posição final do indice da string


        System.out.println("Original: -" + original + "-");
        System.out.println("toLoweCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("toUpperCase: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

    }
}
