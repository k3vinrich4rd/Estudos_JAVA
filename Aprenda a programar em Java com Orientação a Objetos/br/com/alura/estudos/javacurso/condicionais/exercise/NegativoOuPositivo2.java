package br.com.alura.estudos.javacurso.condicionais.exercise;

//Forma feia de fazer:
public class NegativoOuPositivo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber se é positivo ou negativo: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVE");
        } else
        if (number > 0){
            System.out.println("POSITIVE");
        }
        input.close();
    }
}