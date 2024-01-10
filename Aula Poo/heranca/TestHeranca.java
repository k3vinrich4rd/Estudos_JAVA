package heranca;

import java.math.BigDecimal;

public class TestHeranca {
    public static void main(String[] args) {

        X6 x6 = new X6();
        x6.setCor("Prata");
        x6.setMotor("2.0");
        x6.setFabricante("BMW");
        x6.setPreco(new BigDecimal("1000000"));
        x6.setQuantidadeDePortas(4);
        x6.ligarCarro(false);
        System.out.println();

        Corsinha corsinha = new Corsinha();
        corsinha.setCor("Preto");
        corsinha.setMotor("1.0");
        corsinha.setFabricante("Chevrolet");
        corsinha.setPreco(new BigDecimal(30000));
        corsinha.setQuantidadeDePortas(2);
        corsinha.desligarCarro(true);

    }
}
