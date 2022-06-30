package operadorternario;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 5000;
        String doar = "Eu vou doar 500 R$ para instituição Kevin Richard";
        String naoDoar = "Eu não vou doar para instituição Kevin Richard";
        String resultado = null;

        if (salario > 5000){
            resultado = doar;
        }else{
            resultado = naoDoar;
        }
        System.out.println(resultado);
    }
}
