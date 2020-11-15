package ex2;


import java.util.Scanner;

public class main {


    static void imprimeMenu(){
        System.out.println(" ## Início ## ");
        System.out.println("1 - Inserir\n2 - Buscar\n3 - Imprimir\n4 - Remover\n0 - Sair");
    }


    public static void main(String[] args) {
        Lista l = new Lista();
        Scanner tec = new Scanner(System.in);
        int num = 0;
        int op;

        while(true){
            System.out.println("");
            System.out.println("");
            imprimeMenu();
            op = tec.nextInt();
            tec.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o Nome do Atleta: ");
                    String nome = tec.nextLine();
                    System.out.println("Digite a altura: ");
                    double altura = tec.nextDouble();
                    System.out.println("Digite o peso: ");
                    double peso = tec.nextDouble();
                    tec.nextLine();
                    System.out.println("Digite o esporte: ");
                    String esporte = tec.nextLine();
                    System.out.println("Digite o patrocinio: ");
                    String patrocinio = tec.nextLine();

                    No n = new No (nome, altura, peso, esporte, patrocinio);
                    l.insere(n);

                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    String name = tec.nextLine();

                    No search = l.busca(name);
                    if(search != null){
                        System.out.println("Resultado da busca\n"+search.toString());
                    }else {
                        System.out.println("Atleta não encontrado!");
                    }

                    break;
                case 3:
                    l.imprime();
                    break;
                case 4:
                    System.out.println("Digite o nome do atleta a ser removido: ");
                    String atleta = tec.nextLine();
                    l.remove(atleta);
                    break;
                case 0:
                    num = - 3;
                    break;
            }

            if (num == -3){
                break;
            }

        }


    }
}
