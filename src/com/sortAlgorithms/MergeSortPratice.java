package com.sortAlgorithms;

public class MergeSortPratice {
    public int[] splitThanMerge(int[] array){
        int length =array.length;
        int mid =length/2;
        int[] left=new int[mid];
        int[] right=new int[length-mid];
        for (int i=0;i<left.length;i++){
            left[i]=array[i];
        }
        for (int j=0;j<right.length;j++){
            right[j]=array[mid+j];
        }
        splitThanMerge(left);
        splitThanMerge(right);
        merge(array,left,right);
        return array;
    }

    public void merge(int[] left,int[] right,int[] array){
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length&&j<right.length){
            if (left[i]<right[j]){
                array[k++]=left[i++];
            }
            if (left[i]>right[j]){
                array[k++]=right[j++];
            }
        }
        while (i<left.length){
            array[k++]=left[i++];
        }
        while (j<right.length){
            array[k++]=right[j++];
        }
    }
}
