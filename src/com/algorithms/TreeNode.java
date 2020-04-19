package com.algorithms;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//FindLargerstInEachRow {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      public TreeNode() {}



    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int temp= Integer.MIN_VALUE;
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if (node.val>temp){
                    temp=node.val;
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }result.add(temp);
        }return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(5);
        left.right = new TreeNode(3);
        right.right=new TreeNode(9);
        TreeNode treeNode=new TreeNode();
        System.out.println(treeNode.largestValues(root));

    }
}
