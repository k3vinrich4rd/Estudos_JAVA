package polimorfismosobreposicao;
//Height do projeto
public class Main {
    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero(5.70,8,4,"Preto");
        mamifero1.locomover();
        mamifero1.alimentar();
        mamifero1.emitirSom();
        System.out.println();

        Canguru canguru1 = new Canguru(20,3,4,"Marrom");
        canguru1.locomover();
        canguru1.usarBolsa();
        canguru1.alimentar();
        canguru1.emitirSom();
        System.out.println();

        Cachorro cachorro1 = new Cachorro(10,1,3,"Preto");
        cachorro1.locomover();
        cachorro1.alimentar();
        cachorro1.emitirSom();
        System.out.println();


        Reptil reptil1 =  new Reptil(30,3,4,"Marrom");
        reptil1.locomover();
        reptil1.alimentar();
        reptil1.emitirSom();
        System.out.println();

        Cobra cobra1 = new Cobra(15,2,0,"Verde");
        cobra1.locomover();
        cobra1.alimentar();
        cobra1.emitirSom();
        System.out.println();

        Tartaruga tartaruga1 = new Tartaruga(9,100,4,"Verde");
        tartaruga1.locomover();
        tartaruga1.alimentar();
        tartaruga1.emitirSom();
        System.out.println();

        Peixe peixe1 = new Peixe(3.94,5,4,"Preto");
        peixe1.alimentar();
        peixe1.locomover();
        peixe1.emitirSom();
        System.out.println();

        Goldfish goldfish1 = new Goldfish(2.80,2,0,"Laranja Dourada");
        goldfish1.alimentar();
        goldfish1.locomover();
        goldfish1.emitirSom();
        goldfish1.soltarBolha();
        System.out.println();



        Ave ave1 = new Ave(5,1,0,"Amarela");
        ave1.locomover();
        ave1.alimentar();
        ave1.emitirSom();
        ave1.fazerninho();
        System.out.println();

        Arara arara1 = new Arara(1.7,2,0,"Azul");
        arara1.alimentar();
        arara1.locomover();
        arara1.emitirSom();
        arara1.fazerninho();

    }

}
