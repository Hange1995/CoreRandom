package com.sortAlgorithms;

public class QuickSort1 {

    public int[] quickSort1(int[] array){
        return quickSort1(0,array.length-1,array);
    }



    private int[] quickSort1(int begin, int end, int[] array){
        if (begin<end){
            int i=partition(array,begin,end);
            quickSort1(begin,i-1,array);
            quickSort1(i+1,end,array);
        }
        return array;

    }



    public int partition(int[] array ,int begin, int end){
        int pivot=end;
        int i = begin;
        for (int x=begin; x<end;x++){
            if (array[x]<array[pivot]){
                swap(x,i++,array);
            }
        }
        swap(i,pivot,array);
        return i;
    }
    public void swap(int x,int y,int[] array){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }
}
