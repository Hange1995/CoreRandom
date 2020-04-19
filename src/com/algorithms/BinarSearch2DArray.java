package com.algorithms;

public class BinarSearch2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null) return false;
        int low = 0;
        int high =matrix.length*matrix[0].length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            int row = (mid/matrix[0].length);
            int column=(mid%matrix[0].length);
            int temp= matrix[row][column];
            if (target>temp){
                low =mid+1;
            }else if (target<temp){
                high=mid-1;
            }else return true;
        }return false;
    }

    public static void main(String[] args) {
        BinarSearch2DArray binarSearch2DArray=new BinarSearch2DArray();
        int [][]a ={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(binarSearch2DArray.searchMatrix(a,50));
    }
}
