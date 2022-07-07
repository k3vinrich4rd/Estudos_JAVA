package professor;

public class MainProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julio";
        professor.idade = 28;
        professor.altura = 1.75;

        // Para imprimir quebrando a linha:
        System.out.println(professor.nome + "\n" + professor.idade + " anos" + "\n"+ professor.altura + " m de altura" );

        // Para imprimir tudo na mesma linha
        System.out.println("O professor " + professor.nome + " " + "tem " + professor.idade + "" + " anos de idade e, " + professor.altura + "" + " m de altura");
    }
}
