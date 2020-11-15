package ex6;


public class Main {
    static No[] bubbleSort(No[] array){

        No aux = new No(-1);

        System.out.println("\nBubbleSort");

        for (int out= array.length-1; out > 0; out--){
            for (int in = 0; in < out; in++) {
                if (array[in].chave > array[in+1].chave){
                    aux = array[in];
                    array[in] = array[in+1];
                    array[in+1] = aux;
                }
            }
        }
        return array;
    }

    static No[] insertionSort(No[] array){
        System.out.println("\nInsertioSort");

        No aux = new No(-1);
        for (int out = 1; out < array.length ; out++) {
            for (int in = out; in > 0; in--) {
                if (array[in].chave < array[in-1].chave){
                    aux = array[in];
                    array[in] = array[in-1];
                    array[in-1] = aux;
                }
            }
        }

        return array;
    }

    static No[] selectionSort(No[] array){

        System.out.println("\nSelectionSort");



        No menor = new No(-1);
        int indice = 0;
        No aux = new No(-1);

        for (int out = 0; out < array.length; out++) {
            menor = array[out];
            indice = out;

            for (int in = out; in < array.length; in++) {
                if (array[in].chave < menor.chave){
                    menor = array[in];
                    indice = in;
                }
            }
            aux = array[out];
            array[out] = menor;
            array[indice] = aux;
        }


         return array;
    }

        public static void main(String[] args) {



            No[] vetObj = new No[4];



            No n = new No(3);
            vetObj[0] = n;

            n = new No(4);
            vetObj[1] = n;

            n = new No(1);
            vetObj[2] = n;

            n = new No(2);
            vetObj[3] = n;

            for (int i = 0; i < 4; i++) {
                System.out.print(vetObj[i].chave+" ");
            }

            //chamar funcao com o algoritmo desejado
           // bubbleSort(vetObj);
            insertionSort(vetObj);
           // selectionSort(vetObj);


            System.out.println();
            for (int i = 0; i < 4; i++) {
                System.out.print(vetObj[i].chave+" ");
            }

    }
}
