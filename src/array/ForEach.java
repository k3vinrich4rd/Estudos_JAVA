package array;
// Usando ForEach com array:
public class ForEach {
    public static void main(String[] args) {
        int[] numero = new int[]{5, 4, 3, 2, 1};
        // ForEach não necessita de indices, pois ele se localiza através da chaves
        for (int num : numero) { // ForEach
            System.out.println(num + " ");
        }
    }
}