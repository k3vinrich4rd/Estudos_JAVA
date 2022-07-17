package professor;

public class MainProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor(); // Objeto
        professor.nome = "Julio"; // Atributos do objeto
        professor.idade = 28; // Atributos do objeto
        professor.altura = 1.75; // Atributos do objeto

        // Para imprimir quebrando a linha:
        System.out.println(professor.nome + "\n" + professor.idade + " anos" + "\n"+ professor.altura + " m de altura" );

        // Para imprimir tudo na mesma linha
        System.out.println("O professor " + professor.nome + " " + "tem " + professor.idade + "" + " anos de idade e, " + professor.altura + "" + " m de altura");
    }
}
