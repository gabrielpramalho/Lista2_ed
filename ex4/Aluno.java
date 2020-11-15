package ex4;

public class Aluno {
    String nome;
    int matricula;
    double nota;
    String nomeCurso;

    Aluno proximo;
    Aluno anterior;

    public Aluno(String nome, int matricula, double nota, String nomeCurso){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
        this.nomeCurso = nomeCurso;
    }

    public String toString(){
        return "Nome: "+this.nome+"\nMatricula: "+this.matricula+"\nNota: "+this.nota+"\nNome do Curso: "+this.nomeCurso+"\n";
    }
}
