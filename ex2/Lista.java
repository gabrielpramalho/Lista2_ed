package ex2;

public class Lista {

    No inicio;
    No fim;

    public void insere(No n) {

        if (inicio == null) {
            inicio = n;
            fim = n;
            System.out.println("----- Inicio -------");
            System.out.println("Registro efetuado!");
        } else {
            fim.proximo = n;
            fim = n;
            System.out.println("Registro efetuado!");
        }

    }

    public No busca(String s) {
        No aux = inicio;

        while (aux != null) {
            if (aux.nome.contains(s)) {
                return aux;
            }
            aux = aux.proximo;
        }
        return null;
    }

    public No buscaAnt(String s) {
        No ant = inicio;

        while (ant != null) {
            if (ant.proximo.nome.contains(s)) {
                return ant;
            }

            ant = ant.proximo;
        }
        return null;
    }

    public No remove(String s) {
        No aux = inicio;

        if (inicio != null) {
            if (aux.nome.contains(s)) {
                if (aux == fim) {
                    inicio = null;
                    fim = null;
                } else {
                    inicio = aux.proximo;
                    aux.proximo = null;
                }
            } else {
                No ant = buscaAnt(s);

                if (ant != null) {
                    aux = ant.proximo;
                    if (aux == fim) {
                        ant.proximo = null;
                        fim = ant;
                    } else {
                        ant.proximo = aux.proximo;
                        aux.proximo = null;
                    }
                } else {
                    System.out.println("Atleta não encontrado!");
                    return null;
                }
            }
            System.out.println("Atleta removido: " + s);
            return aux;
        } else {
            System.out.println("Lista vazia!");
            return null;
        }
    }


    public void imprime() {
        No aux = inicio;
        if (inicio == null) {
            System.out.println("---LISTA VAZIA---");
        } else {
            while (aux != null) {
                System.out.println(aux.toString());
                System.out.println();
                aux = aux.proximo;
            }
        }
    }
}