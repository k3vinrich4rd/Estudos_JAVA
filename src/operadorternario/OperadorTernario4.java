package operadorternario;

public class OperadorTernario4 {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;

        categoria = idade < 15 ? "Catégoria infatil" : idade >= 15 && idade < 18 ? "Catégoria Juvenil": "Categoria adulto";
        System.out.println(categoria);
    }
}
