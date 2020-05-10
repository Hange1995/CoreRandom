package com.sortAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array){
        int length= array.length;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<length-1;j++){
                if (array[j]>array[j+1]){
                    swap(j,j+1,array);
                }
            }
            length--;
        }return array;
    }
    public  void swap(int x,int y,int[] array){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }

    public static void main(String[] args) {
        BubbleSort bubbleSort= new BubbleSort();
        int[] test= {1,2,5,3,7};
        int[] result = bubbleSort.bubbleSort(test);
        System.out.println(Arrays.toString(result));
    }
}
