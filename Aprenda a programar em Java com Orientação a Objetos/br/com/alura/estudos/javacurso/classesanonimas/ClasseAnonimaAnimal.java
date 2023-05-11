package br.com.alura.estudos.javacurso.classesanonimas;

public class ClasseAnonimaAnimal {
    public void walk() {
        System.out.println("Andando");
    }


    public static void main(String[] args) {
        ClasseAnonimaAnimal classeAnonimaAnimal = new ClasseAnonimaAnimal() {
            @Override
            public void walk() {
                System.out.println("Correndo");
            }
        };
        classeAnonimaAnimal.walk();
    }

}