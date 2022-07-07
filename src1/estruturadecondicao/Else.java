package estruturadecondicao;


// Utilizando a estrutura Else (se não), em cotexto de aprovação não permitida

public class Else {

    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18; // or = false
        // Estrutura condicional:
        if (isAutorizadoComprarBebida){
            System.out.println("Você pode comprar bebida alcólica");
        }else{
            System.out.println("Você não pode comprar bebida alcólica");
        }
    }
}
