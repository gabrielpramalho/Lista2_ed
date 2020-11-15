package ex3;

public class PrincipalPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        No n = new No(1, "A");

        p.insere(n);

        n = new No(2, "B");
        p.insere(n);
        p.imprimePilha();
        p.remove();
        p.imprimePilha();
        n = new No(3, "C");
        p.insere(n);

        p.imprimePilha();
    }
}
