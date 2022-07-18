package uec;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutadores[1] = new Lutador("Putzscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshodow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Autrália", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("Ufucobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        lutadores[0].ganharLuta();
        lutadores[0].getPeso();
        lutadores[0].status();
        lutadores[0].apresentar();
    }
}