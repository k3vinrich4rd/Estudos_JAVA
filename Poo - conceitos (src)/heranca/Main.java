package heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Kevin Richard");
        pessoa2.setNome("Ketelyn Mayara");
        pessoa3.setNome("Carlos Eduardo");
        pessoa4.setNome("Vilma Regiane");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());

        pessoa3.receberAumento(1500);
        pessoa4.mudarTrabalho();
    }
}
