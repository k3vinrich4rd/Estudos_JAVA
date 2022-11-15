package poo.exercicio3;

public class Student {

    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public double finalNote() { //Nota final
        return firstNote + secondNote + thirdNote;
    }

    public double missingPoints() { //Pontos que faltaram para o aluno passar
        if (finalNote() < 60.0) {
            return 60.0 - finalNote();
        } else {
            return 0.0;
        }
    }

}
