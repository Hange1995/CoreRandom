package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumBinaryTree {

    class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
        public int getVal() {
            return val;
        }
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return setleftandright(nums,0,nums.length);
    }

    public TreeNode setleftandright(int[] nums,int begin,int end){
        if (begin==end || begin>nums.length) return null;
        TreeNode root=new TreeNode(nums[findMaxIndex(nums,begin,end)]);
        root.left=setleftandright(nums,begin,findMaxIndex(nums,begin,end));
        root.right=setleftandright(nums,findMaxIndex(nums,begin,end)+1,end);
        return root;
    }

    public int findMaxIndex(int[] nums,int begin,int end){
        if (nums.length==0) return -1;
        int max=0;
        int maxIndex=begin;
        for (int i=begin;i<end;i++){
            if (nums[i] > max) {
                max=nums[i];
                maxIndex=i;
            }
        }return maxIndex;
    }

    public static void main(String[] args) {
        MaximumBinaryTree maximumBinaryTree=new MaximumBinaryTree();
        int[] a ={3,2,1,6,0,5};
        TreeNode noe = maximumBinaryTree.constructMaximumBinaryTree(a);
    }
}
