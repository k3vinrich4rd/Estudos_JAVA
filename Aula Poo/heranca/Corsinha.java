package heranca;

import java.math.BigDecimal;

public class Corsinha extends Carro {
    public Corsinha(String cor, String motor, int quantidadeDePortas, BigDecimal preco, String fabricante) {
        super(cor, motor, fabricante, preco, quantidadeDePortas);
    }

    public Corsinha() {
    }
}