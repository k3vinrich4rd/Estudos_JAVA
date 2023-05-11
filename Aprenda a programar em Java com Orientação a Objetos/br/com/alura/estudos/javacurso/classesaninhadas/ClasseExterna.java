package br.com.alura.estudos.javacurso.classesaninhadas;

// Em classes aninhadas as classes internas tem acesso aos atributos das classes externas
public class ClasseExterna {
    private String texto = "Texto externo";

    public class ClasseInterna {
        private String texto = "Texto Interno";

        public void imprimeTexto() {
            System.out.println(texto);
            System.out.println(ClasseExterna.this.texto);
        }
    }

    //Forma de instanciar
    public static void main(String[] args) {
        ClasseExterna classeExterna = new ClasseExterna();
        ClasseInterna classeInterna = classeExterna.new ClasseInterna();
        // se a classe interna não fosse estática, não precisaríamos da instância da classe externa
        classeInterna.imprimeTexto();
    }
}