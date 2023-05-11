package br.com.alura.estudos.javacurso.classeslocal;

/* Com a classe local, podemos cria - lá dentro de um método,
instância, chamar os métodos dessa classe...
Porém, quando utilizamos a classe local, a classe só tem escopo no método
sendo impossível instanciar a um objeto da classe fora do método que ela pertence.
 */
public class Local {
    public void metodoQualquer() {
        class ClasseLocal {
            private String text = "texto classe local";

            public void imprimeTexto() {
                System.out.println(text);
            }
        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTexto();

    }

    //Forma de instanciar
    public static void main(String[] args) {
        Local local = new Local();
        local.metodoQualquer();
    }
}