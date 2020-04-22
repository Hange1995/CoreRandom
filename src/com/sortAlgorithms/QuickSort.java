package com.sortAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[]array,int begin,int end){
        if (begin<end){
            int pIndex=partition(array,begin,end);
            quickSort(array,begin,pIndex-1);
            quickSort(array,pIndex+1,end);
        }
        return array;
    }
    public int partition(int[] array, int begin, int end){
        int pivot =array[end];
        int pIndex=begin;
        for (int i=begin;i<end;i++){
            if (array[i]<=pivot){
                swap(array,i,pIndex++);
            }
        }
        swap(array,pIndex,end);
        return pIndex;
    }
    public void swap(int[] array, int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args) {
        int[] a ={2,1,6,5,9,4};
        QuickSort quickSort=new QuickSort();
        System.out.println(Arrays.toString(quickSort.quickSort(a,0,5)));
    }
}
