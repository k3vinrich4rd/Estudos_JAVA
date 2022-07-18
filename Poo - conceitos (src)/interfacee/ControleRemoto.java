package interfacee;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Método construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }

    //Métodos Abstratos:
    @Override
    public void ligar() {
        this.setLigado(true);

    }

    //Métodos Abstratos:
    @Override
    public void desligar() {
        this.setLigado(false);
    }

    //Métodos Abstratos:
    @Override
    public void abrirMenu() {
        if (getLigado()) {
            System.out.println("Você está no menu do seu controle: ");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());

            for (int contador = 0; contador <= this.getVolume(); contador += 10) {
                System.out.print("[]");
            }
        }else {
            System.out.println("Impossivel efetuar essa ação a Tv está desligada");
        }

    }


    //Métodos Abstratos:
    @Override
    public void fecharMenu() {
        System.out.println("Ok, fechando menu...");
    }

    //Métodos Abstratos:
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar volume");
        }

    }

    //Métodos Abstratos:
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);

        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    //Métodos Abstratos:
    @Override
    public void ligarMudo() {
        if (this.getLigado() && getVolume() > 0) {
            this.setVolume(0);
        }else {
            System.out.println("A sua televisão já está sem volume");
        }
    }

    //Métodos Abstratos:
    @Override
    public void deligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else {
            System.out.println("O modo mudo da sua televisão já está desabilitado");
        }
    }

    //Métodos Abstratos:
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir ");
        }
    }

    //Métodos Abstratos:
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);

        } else {
            System.out.println("Não consegui pausar");
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
