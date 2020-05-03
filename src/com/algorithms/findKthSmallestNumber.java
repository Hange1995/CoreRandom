package com.algorithms;

public class findKthSmallestNumber {
    public int kthSmallestNum(int[] nums, int k) {
        if (k<1||k>nums.length) throw new IllegalStateException("The K can't great than the length of array or smaller than 1");
        for (int i=0;i<k;i++){
            int[] newList = new int[nums.length-1];
            for (int j=0;j<newList.length;j++){
                newList[j]=nums[j+1];
            }
            heapify(newList);
            nums=newList;
        }
        int a=nums[0];
        return a;
    }
    public void heapify(int[] array){
        int largestParent= (array.length/2)-1;
        for (int i = largestParent;i>=0;i--){
            heapify(array,largestParent);
        }
    }
    public void heapify(int[]array,int index){
        int smallerIndex=index;
        int left = (index*2)+ 1;
        int right= (index*2)+ 2;
        if (array[smallerIndex]>array[left]&&left<array.length){
            smallerIndex=left;
        }
        if (array[smallerIndex]>array[right]&&right<array.length){
            smallerIndex=right;
        }
        if (smallerIndex!=index) {
            swap(array, smallerIndex, index);
            heapify(array, smallerIndex);
        }
    }
    public void swap(int[] array, int leftIndex, int rightIndex){
        int temp = array[leftIndex];
        array[leftIndex]=array[rightIndex];
        array[rightIndex]=temp;
    }

}
