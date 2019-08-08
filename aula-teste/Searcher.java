package com.company;

public class Searcher {
    public int search(int[] array, int value) {
        /*
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                return i;
            }
        }*/
    return binarySearch(array, value, 0, array.length-1);
}
    private int binarySearch(int[] array, int value, int start, int end) {
        if (end < start) {
            return -1;
        }
        int meio = Math.floorDiv(start + end, 2);
        if (value == array[meio]) {
            return meio;
        }
        if (value < array[meio]) {
            return binarySearch(array, value, start, meio - 1);
        } else {
            return binarySearch(array, value, meio + 1, end);
        }
    }




}
