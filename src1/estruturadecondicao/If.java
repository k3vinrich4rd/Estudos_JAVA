package estruturadecondicao;
/*
If (Se) Definição
A estrutura de controle if (se),
 é utilizada para executar alguns comandos apenas se a sua condição for true (verdadeira).
 O else (senão) pode ou não acompanhar o if, mas o else não pode ser usado sozinho,
 é utilizado para executar alguns comandos caso a condição do if for false (falso)
 */
public class If { // Utilizando a estrutura If (Se) com um conectivo lógico (! = negação)
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Você pode comprar bebida alcólica");

        if (!isAutorizadoComprarBebidaAlcolica) { // ! = negação)
            System.out.println("Você não pode comprar bebida alcolica");
        }
    }
}
