package heranca2;

public class Main {
    public static void main(String[] args) {
        Visitante visitante = new Visitante("Carlos", 30, "Masculino");
        Aluno aluno = new Aluno("Kevin Richard", 19,"Masculino", 424242, "TADS");
        Bolsista bolsista = new Bolsista("Nathalia", 19, "Feminino", 434343, "Ciências sociais", 12.5);
        Professor professor = new Professor("Norberto", 54, "Masculino","Quimica",2000);
        Tecnico tecnico = new Tecnico("Felipe Ribeiro", 21,"Masculino", 3434343,"TADS","756764747474");


        System.out.println(aluno.toString());
        aluno.pagarMensalidade();
        System.out.println(bolsista.toString());
        bolsista.renovarBolsa();
        bolsista.pagarMensalidade();
    }
}
