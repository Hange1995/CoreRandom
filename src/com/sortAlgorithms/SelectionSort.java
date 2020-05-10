package com.sortAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectSort(int[] array){
        for (int i=0;i<array.length;i++){
            int min = array[i];
            int position=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<min){
                    position=j;
                    min=array[j];
                }
            }
            swap(i,position,array);
        }return array;
    }
    public void swap(int x,int y,int[] array){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }


    public static void main(String[] args) {
        SelectionSort selectionSort=new SelectionSort();
        int[] test= {1,6,3,7,2};
        System.out.println(Arrays.toString(selectionSort.selectSort(test)));
    }
}
