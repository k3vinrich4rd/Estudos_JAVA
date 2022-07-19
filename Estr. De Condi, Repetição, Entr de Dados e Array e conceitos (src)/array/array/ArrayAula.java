package array.array;

public class ArrayAula {
    public static void main(String[] args) {
        double[] horarioAcordados = new double[60];

        horarioAcordados[0] = 9.00;
        horarioAcordados[1] = 10.0;
        horarioAcordados[2] = 7.39;
        horarioAcordados[4] = 6.54;
        horarioAcordados[5] = 8.54;
        horarioAcordados[6] = 7.54;

        System.out.println( "O horário do 3º dia foi:  " + horarioAcordados[2]);
        // Array utiliza length para pegar o tamanho da lista
        System.out.println(horarioAcordados.length);


        for (int i = 0; i < horarioAcordados.length; i++) {
            System.out.println("O horário que você acordou no : " + (i + 1) + "º dia foi: " + horarioAcordados[i] );
        }

        int contador = 0;
        while (contador < horarioAcordados.length){
            System.out.println("O horário que você acordou no : " + (contador + 1) + "º dia foi: " + horarioAcordados[contador] );
            contador++;
        }
    }
}
