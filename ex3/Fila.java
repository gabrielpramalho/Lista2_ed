package ex3;

public class Fila {
    No incio;
    No fim;

    public void insere(No n){
        if (incio == null){
            incio = n;
            fim = n;
            System.out.println("iniciando fila!");
        }else{
            fim.proximo = n;
            n.anterior = fim;
            fim = n;
            System.out.println("Registro efetuado!");
        }
    }

    public No remove(){
        No aux = incio;

        if(incio != null){
            if (aux==fim){
                incio = null;
                fim = null;
                return aux;
            }else{
                incio = incio.proximo;
                aux.proximo = null;
                incio.anterior = null;
                return aux;
            }
        } else{
            System.out.println("Lista vazia!");
            return null;
        }
    }

    public No busca (String s){
        No aux = incio;

        while (aux != null){
            if (aux.nome.contains(s)){
                System.out.println("----------------");
                System.out.println(aux.toString());
                System.out.println("----------------");
                return aux;
            }
            aux = aux.proximo;
        }
        System.out.println("Elemento não encontrado");
        return null;
    }


    public void imprimeFila(){
        No aux = incio;

        while (aux != null){
            System.out.println(aux.toString());
            aux = aux.proximo;
        }
    }
}
