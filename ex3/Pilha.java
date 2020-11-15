package ex3;

public class Pilha {
    No inicio;
    No topo;

    public void insere(No n){
        if (inicio == null){
            inicio = n;
            topo = n;
            System.out.println("Iniciando pilha");
        }else{
            topo.proximo = n;
            n.anterior = topo;
            topo = n;
            System.out.println("Registro efetuado");
        }
    }

    public void remove(){
        No aux = topo;

        if(inicio != null){
            if (aux == inicio){
                inicio = null;
                topo = null;
                System.out.println("Removido com sucesso");
            }else{
                topo = topo.anterior;
                aux.anterior = null;
                topo.proximo = null;
                System.out.println("Removido com sucesso");
            }
        }
    }

    public No busca(String s){
        No aux = inicio;

        while (aux != null){
            if (aux.nome.contains(s)){
                System.out.println("--------------");
                System.out.println(aux.toString());
                System.out.println("--------------");
                return aux;
            }

            aux = aux.proximo;
        }
        System.out.println("Elemento não encontrado");
        return null;
    }

    public void imprimePilha(){
        No aux = inicio;

        while (aux != null){
            System.out.println(aux.toString());
            aux = aux.proximo;
        }
    }
}
