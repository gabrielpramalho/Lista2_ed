package ex3;

public class No {
    int id;
    String nome;

    No proximo;
    No anterior;

    public No (int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String toString(){
        return "id: "+this.id+" nome: "+this.nome+"\n";
    }
}
