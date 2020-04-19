package com.algorithms;

public class BinarySearch {
    public boolean binarySearch(int[] a,int b){
        int low =0;
        int high = a.length-1;
        while (low!=high){
            int temp= a[low+ (high-low)/2];
            if (b>temp){
                low=low+ ((high-low)/2)+1;
            } else if (b<temp){
                high=low+ ((high-low)/2)-1;
            }else {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        int[] a ={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch.binarySearch(a,8));
    }
}
