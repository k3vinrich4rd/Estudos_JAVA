package array.arraylist;
// Trabalhando com duas Arrays:
public class Array3Guanabara {
    public static void main(String[] args) {
        // Primeira array:
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
        // Segunda array:
        int [] totalDeDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31  };
        for (int contador = 0; contador < mes.length; contador++) { // ForEach
            System.out.println("O mês de " + mes[contador] + " tem " + totalDeDias[contador] + " dias ao todo");
        }
    }
}
