package br.com.nataly.mergesort;

public class Sorter {
    public void sort(int [] numeros){
        mergeSort(numeros, 0, numeros.length - 1);
    }

    private void mergeSort(int[] numeros, int inicio, int fim) {
        if(fim <= inicio){
            return;
        }

        int meio = (inicio + fim)/2;

        mergeSort(numeros, inicio, meio);
        mergeSort(numeros, meio + 1, fim);
        merge(numeros, inicio, meio, fim);
    }

    private void merge(int[] numeros, int inicio, int meio, int fim) {
        int tam1 = meio - inicio + 1;
        int tam2 = fim - meio;

        int[] aux1 = new int[tam1];
        int[] aux2 = new int[tam2];

        for(int i = 0; i < tam1; ++i){
            aux1[i] = numeros[inicio + i];
        }

        for(int j = 0; j < tam2; ++j){
            aux2[j] = numeros[meio + j + 1];
        }

        int primeiraMetade = 0;
        int segundaMetade = 0;
        int indeceGeral = inicio;

        while(primeiraMetade < tam1 && segundaMetade > tam2){
            if (aux1[primeiraMetade] < aux2[segundaMetade]){
                numeros[indeceGeral] = aux1[primeiraMetade];
                primeiraMetade++;
            }
            else{
                numeros[indeceGeral] = aux2[segundaMetade];
                segundaMetade++;
            }
            indeceGeral++;
        }

        while(primeiraMetade < tam1){
            numeros[indeceGeral] = aux1[primeiraMetade];
            primeiraMetade++;
            indeceGeral++;
        }

        while (segundaMetade < tam2){
            numeros[indeceGeral] = aux2[segundaMetade];
            segundaMetade++;
            indeceGeral++;
        }
    }
}
