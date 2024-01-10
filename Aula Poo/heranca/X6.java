package heranca;

import java.math.BigDecimal;

public class X6 extends Carro {
    public X6(String cor, String motor, int quantidadeDePortas, BigDecimal preco, String fabricante) {
        super(cor, motor, fabricante, preco, quantidadeDePortas);
    }

    public X6() {
    }
}