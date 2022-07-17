package estruturadecondicao;

/* Else if (se não) definição:
A declaração else if em java também testa uma condição.
Executa se a condição do bloco if é verdadeira caso contrário o bloco else é executado
 */
// Utilizando a estrutura else if (se não se) para outros contextos além do if (se)
public class ElseIf {
    public static void main(String[] args) {
        // Estrutura Condicional
        int idade = 19;
        if (idade < 15){
            System.out.println("Categoria infatil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Catégoria juvenil ");
        } else {
            System.out.println("Catégoria adulta");
        }
    }
}
