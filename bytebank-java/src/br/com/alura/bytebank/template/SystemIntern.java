package br.com.alura.bytebank.template;
/**Classe System Intern. Representando o sistema bancário de bytebank-java
para os clientes autenticados
 @author Kevin Richard */
public class SystemIntern {
    /**Atributo da classe*/
    public int passwordSystemIntern;
    /**Atributo da classe*/
    public String loginSystemIntern;

    /** Método publico e retorna vazio (Void)
    cujo objetivo é recebe a ‘interface’ (E assim quem a implementou)
    e passar no parâmetro um "Login" e "password"

    E assim aplicando uma lógica condicional, que é
    se o ‘login’ e a password informados pelo client forem aceitos
    ele terá acesso ao sistema do bytebank-java
     @param authentication
     @param loginUser
     @param passwordUser */
    public void authentication(Authentication authentication, String loginUser, int passwordUser) {
        boolean authentic = authentication.authenticatedLoginAndPassword(this.loginSystemIntern = loginUser, this.passwordSystemIntern = passwordUser);
        if (!authentic) {
            System.out.println("Access not released, password or incorrect login");
            return;
        }
        System.out.println("Welcome to bytebank-java");
    }
}
