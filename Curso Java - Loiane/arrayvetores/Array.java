package arrayvetores;

public class Array {
    public static void main(String[] args){
        /* Sem a possibilidade da existência do array:
         double temperatura = 31,2
         double temperatura = 31.0
         double temperatura = 31.5
         double temperatura = 31.9
                */

        //Quando não temos a informação:
        double[] temperatura = new double[365];
        //Para adicionar a informação:
        temperatura[0] = 32.0;
        temperatura[1] = 30.0;
        temperatura[2] = 23.0;

        //Como imprimir um valor isolado:
        System.out.println("O valor da temperatura do 1º dia é: " + temperatura[0]);
        //length revela o tamanho do array
        System.out.println("O tamanho do Array é: " + temperatura.length);

        //Para imprimir todos os valores existentes no Array:
        for (int i = 0; i < temperatura.length; ++i){
            System.out.println("O valor da temperatura do " + (i + 1 ) + " é: " + temperatura[i]);
        }
    }
}
