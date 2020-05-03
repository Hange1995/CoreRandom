package com.sortAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public int[] splitThanMerge(int[] a){
        int size=a.length;
        if (size<2) return a;
        int mid = size/2;
        int[] left = new int[mid];
        int[] right=new int[size-mid];
        for (int i=0;i<left.length;i++){
            left[i]=a[i];
        }
        for (int i=mid;i<size;i++){
            right[i-mid]=a[i];
        }
        splitThanMerge(left);
        splitThanMerge(right);
        merge(a,left,right);
        return a;
    }

    public void merge(int[] a, int[]left ,int[]right){
        int i=0;
        int j=0;
        int k=0;
        while (j<left.length&&k<right.length){
            if (left[j]<right[k]){
                a[i++]=left[j++];
            } else {
                a[i++]=right[k++];
            }
        }
        while (j <left.length){
            a[i++]=left[j++];
        }
        while (k<right.length){
            a[i++]=right[k++];
        }

    }

    public static void main(String[] args) {
        int[] a ={2,1,6,5,9,4};
        MergeSort mergeSort=new MergeSort();
        int[] b = mergeSort.splitThanMerge(a);
        System.out.println(Arrays.toString(b));
    }

}
