package br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.test;


import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.BonusControl;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Designer;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.Manager;
import br.com.alura.estudos.javacurso.poo.bytebank.polimorfismo.templates.VideoEditor;

public class TestBehaviorBonusControl {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Kevin Richard");
        manager.setSalary(5000.0);
        VideoEditor videoEditor = new VideoEditor();
        videoEditor.setName("Vilma Regiane");
        videoEditor.setSalary(2500.00);

        Designer designer = new Designer();
        designer.setName("Carlos Eduardo");
        designer.setSalary(2000.0);

        BonusControl bonusControl = new BonusControl();
        bonusControl.register(manager);
        bonusControl.register(videoEditor);
        bonusControl.register(designer);

        System.out.printf("%.2f", bonusControl.getSum());
    }
}