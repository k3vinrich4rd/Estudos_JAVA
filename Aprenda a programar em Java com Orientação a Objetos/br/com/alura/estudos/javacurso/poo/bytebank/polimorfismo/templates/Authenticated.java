package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates;

/*‘Interface’ (Definição Informal) → É uma classe abstrata
com todos os seus métodos abstratos, mas sem as regras de herança
um ‘interface’ também não possui nada concreto (comportamento/atributo)

Outra forma de se enter uma ‘interface’, e vê-lá como um contrato
exemplo:
Contrato autenticável
que assina esse contrato, precisa implementar:
        //Método setSenha
        //Método autentica */

public interface Authenticated {

    public void setPassword(int password);

    public boolean authenticated(int password);

}