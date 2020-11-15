package ex3;

public class PrincipalFila {

    public static void main(String[] args) {
        Fila f = new Fila();

        No n = new No(1, "A");

        f.insere(n);

        n = new No(2, "B");
        f.insere(n);

        n = new No(3, "C");
        f.insere(n);

        f.imprimeFila();
        f.remove();
        f.imprimeFila();
    }


}
