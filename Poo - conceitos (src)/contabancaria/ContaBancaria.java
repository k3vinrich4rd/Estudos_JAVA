package contabancaria;

// Modelando uma classe conta banco:
public class ContaBancaria { // Classe
    public int numeroDaConta; // Atributo
    protected String tipo;  // Atributo

    private String donoDaConta;  // Atributo
    private double saldo; // Atributo
    private boolean status;  // Atributo


    public ContaBancaria() { // Método construtor
        this.saldo = 0;
        this.status = false;


    }

    // Método personalizado

    public void estadoAtual() {
        System.out.println();
        System.out.println("Conta: " + this.getNumeroDaConta());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono da conta " + this.getDonoDaConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());

    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo); // Acessando a informação diretamente do método modificador
        this.setStatus(true);
        if (tipo == "Conta corrente") {
            this.setSaldo(50);
        } else if (tipo == "Conta poupança") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // Método personalizado

    public void fecharConta() {
        if (this.getSaldo() > 0) { // Acessando a informação diretamente do método de acesso
            System.out.println("Impossivel executar está ação, saldo existente na conta");
        } else if (this.getSaldo() < 0) { // Acessando a informação diretamente do método de acesso
            System.out.println("Impossivel executar está ação, débito existente na conta");
        } else {
            this.setStatus(false); // Acessando a informação diretamente do método modificador
            System.out.println("A sua conta foi fechada com sucesso");
        }
    }

    // Método personalizado
    public void depositar(double valor) {
        if (this.getStatus()) {
            // this.saldo += this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);// Acessando a informação diretamente do método modificador e de acesso
            System.out.println("O seu deposito foi realizado na conta de " + this.getDonoDaConta());
        } else {
            System.out.println("Impossivel fazer um deposito, a sua conta está fechada");
        }
    }

    // Método personalizado
    public void sacar(double valor) {
        if (this.getStatus()) {
            //if (status == true) {
            if (this.getSaldo() >= valor) { // Acessando a informação diretamente do método modificador
                // saldo -= valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoDaConta());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel efetuar saques de uma conta fechada!");
        }
    }

    // Método personalizado
    public void pagarMensal() {
        double v= 0;
        if (this.getTipo() == "CC") {
            v = 12;

        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDonoDaConta());
        } else {
            System.out.println("Impossivel pagar os débitos de uma conta fechada!");
        }

    }

    //Método especial
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    //Método especial
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    //Método especial
    public String getTipo() {
        return tipo;
    }

    //Método especial
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Método especial
    public String getDonoDaConta() {
        return donoDaConta;
    }
    //Método especial

    public void setDonoDaConta(String donoDaConta) {
        this.donoDaConta = donoDaConta;
    }

    //Método especial
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

