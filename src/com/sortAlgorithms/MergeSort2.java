package com.sortAlgorithms;

import java.util.Arrays;

public class MergeSort2 {
    public int[] mergeSort(int [] a){
        if (a==null||a.length==0) return null;
        int[] helper= new int[a.length];
        split(a,helper,0,a.length-1);
        return a;
    }
    public void split(int[] array,int[] helper,int left, int right){
        if (left>=right) return;
        int mid = left+(right-left)/2;
        split(array,helper,left,mid);
        split(array,helper,mid+1,right);
        merge(array,helper,left,mid,right);
    }
    public void merge(int[] array,int[]helper, int left,int mid, int right){
        for (int i=left; i<=right;i++){
            helper[i]=array[i];
        }
        int leftIndex = left;
        int rightIndex=mid+1;
        while (leftIndex<=mid&&rightIndex<=right){
            if (helper[leftIndex]<=helper[rightIndex]) {
                array[left++]=helper[leftIndex++];
            }else {
                array[left++]= helper[rightIndex++];
            }
        }
        while (leftIndex<=mid){
            array[left++]=helper[leftIndex++];
        }

    }


    public static void main(String[] args) {
        int[] a ={2,1,6,5,9,4,5};
        MergeSort2 mergeSort2 =new MergeSort2();
        System.out.println(Arrays.toString(mergeSort2.mergeSort(a)));
    }
}
