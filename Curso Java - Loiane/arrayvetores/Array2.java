package arrayvetores;

public class Array2 {
    public static void main (String [] args){
        // Quando temos a informação e automaticamente o tamanho:
        double[] temperaturas = {30.0, 30.7, 33.5};
        //Para imprimir as informações do Array:
        for (double temperatura : temperaturas){
            System.out.println(temperatura);
        }
    }
}
