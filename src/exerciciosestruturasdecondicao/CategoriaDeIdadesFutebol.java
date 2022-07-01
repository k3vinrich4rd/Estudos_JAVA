package exerciciosestruturasdecondicao;
/*
Else (se não) definição:
A declaração if-else em java também testa uma condição.
Executa se a condição do bloco if é verdadeira caso contrário o bloco else é executado
 */
// Utilizando a estrutura else if (se não se) para outros contextos além do if (se)
public class CategoriaDeIdadesFutebol {
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
