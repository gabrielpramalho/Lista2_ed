package ex4;

 class Lista {

    Aluno incio;
    Aluno fim;

    public void cadastra(Aluno aluno){
        if (incio == null){
            incio = aluno;
            fim = aluno;
            System.out.println("Iniciando lista!\n");
        }else{

            if (aluno.nome.compareToIgnoreCase(incio.nome) <= 0){

                incio.anterior = aluno;
                aluno.proximo = incio;
                incio = aluno;

            } else if(fim.nome.compareToIgnoreCase(aluno.nome) <= 0){
                fim.proximo = aluno;
                aluno.anterior = fim;
                fim = aluno;

            }else{
                Aluno aux = incio.proximo;
                Aluno ant;


                while (aux != null){
                    if(aluno.nome.compareToIgnoreCase(aux.nome) <= 0){

                        ant = aux.anterior;
                        ant.proximo = aluno;
                        aluno.proximo = aux;
                        aux.anterior = aluno;
                        aluno.anterior = ant;
                        break;
                    }
                    aux = aux.proximo;
                }
            }


//
//            fim.proximo = aluno;
//            aluno.anterior = fim;
//            fim = aluno;
//            System.out.println("Registro efetuado com sucesso!");
        }
    }

    public void imprime(){
        Aluno aux = incio;

        while (aux != null){
            System.out.println(aux.toString());
            aux = aux.proximo;
        }
    }
}
