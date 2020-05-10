package com.sortAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int current = array[i];
            int j=i-1;
            while (j>=0&&array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }return array;
    }


    public static void main(String[] args){
        InsertionSort insertionSort=new InsertionSort();
        int[] test= {1,6,3,7,2};
        System.out.println(Arrays.toString(insertionSort.insertSort(test)));

    }
}
