package br.com.alura.estudos.javacurso.classesanonimas;

public class ClasseAnonima1 {
    public void imprimeTexto() {
        System.out.println("Qualquer texto");
    }

    public static void main(String[] args) {

        //Utilizando classe anônima sem a anotação @override
        //Que garante que o método que está sendo sobrescrito tenha os mesmos retornos
        ClasseAnonima1 classeAnonima1 = new ClasseAnonima1() {
            public void imprimeTexto() {
                System.out.println("Sobrescrevendo o método");
            }
        };
        classeAnonima1.imprimeTexto();


        //Utilizando classe anônima com a anotação @override
        //É possível instanciar uma ‘interface’ no java, mas por uma classe anônima
        Text text = new Text() {
            @Override
            public void text() {
                System.out.println("Pelé");
            }
        };
        text.text();
    }
}