package br.com.alura.bytebank.template;
/**‘Interface’’ criada para efetuar um contrato com as classes que a implementar
 onde é definido que toda a classe que implementar essa ‘interface’, tem que
 sobrescrever seus comportamentos abstratos
 @author Kevin Richard
 */
public interface Authentication {

    /** Método abstrato
     * @param login*/

    void setLoginUser(String login);

    /** Método abstrato
     * @param password*/
    void setPasswordUser(int password);

    /** Método abstrato
     * @param login
     * @param password */
    boolean authenticatedLoginAndPassword(String login, int password);

}