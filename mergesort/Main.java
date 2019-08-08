package br.com.nataly.mergesort;

public class Main{
    public static void main(String args[]){

        int[] numeros = {
                10,
                20,
                30,
                40,
                50
        };
        Sorter s = new Sorter();
        s.sort(numeros);
    }
}
