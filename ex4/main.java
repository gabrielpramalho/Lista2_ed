package ex4;

public class main {

    public static void main(String[] args) {
        Lista l = new Lista();

        Aluno a = new Aluno("Gabriel", 14, 98, "CC");
        l.cadastra(a);

        a = new Aluno("Bia", 20, 100, "Ciencia");
        l.cadastra(a);

        a = new Aluno("Diego", 1, 100, "Ciencia");
        l.cadastra(a);

        a = new Aluno("Zoroo", 1, 100, "Ciencia");
        l.cadastra(a);

        a = new Aluno("Fabio", 1, 100, "Ciencia");
        l.cadastra(a);

        a = new Aluno("Alessandro", 1, 100, "Ciencia");
        l.cadastra(a);

        a = new Aluno("Adriana", 1, 100, "Ciencia");
        l.cadastra(a);

        l.imprime();

    }



}
