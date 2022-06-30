package estruturadecondicao;

public class ElseIf2 {
    public static void main(String[] args) {
        int idade = 19;
        String categoria = null; // null = nulo

        if (idade < 15) {
            categoria = "Catégoria infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Catégoria juvenil";
        } else if (idade > 18) {
            categoria = "Catégoria adulta";
        }
        System.out.println(categoria);
    }
}
