package ex2;

public class No {
    String nome;
    double altura;
    double peso;
    String esporte;
    String patrocinio;

    No proximo;

    public No (String nome, double altura, double peso, String esporte, String patrocinio){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.esporte = esporte;
        this.patrocinio = patrocinio;
    }

    public String toString(){
        return "Nome: "+this.nome+"\nAltura: "+altura+"\nPeso: "+this.peso+"\nEsportes: "+this.esporte+"\nPatrocinadores: "+patrocinio;
    }

}
