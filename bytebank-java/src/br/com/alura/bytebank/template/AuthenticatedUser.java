package br.com.alura.bytebank.template;
import br.com.alura.bytebank.exception.AuthenticationFailureException;

/**Classe authenticated, que possiblita client fazer uma composição de seus membros e comportamentos
 como: setLogin, setPassword e doubleAuthentication
 tendo como finalidade e objetivo parecido, o comportamento da classe systemIntern
 que é verificar se os dados do client (‘login’ e 'password') foram informados corretamente
 e cumpre a condição lógica pré estabelecido
 @author Kevin Richard
 */
public class AuthenticatedUser {

    /**Atributo da classe*/
    private String login;
    /**Atributo da classe*/
    private int password;

    /**Métodos de definição de login
      @param login*/
    public void setLogin(String login) {
        this.login = login;
    }

    /**Métodos de definição de password
     @param password*/

    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Método de autenticação onde utilizamos ‘login’ e senha para
     * efetuar uma comparação nos valores e devolver uma reposta
     * ou uma exception
     * @param login
     * @param password
     * @throws AuthenticationFailureException*/
    public void firstAuthentication(String login, int password) throws AuthenticationFailureException {
        if (!this.login.equalsIgnoreCase(login) || this.password != password) {
            System.out.println("Access denied");
            throw new AuthenticationFailureException();
        }
        System.out.println("Access granted");

    }
}