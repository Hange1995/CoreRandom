package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        private TreeNode result;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
            this.result=null;
        }
        public int getVal() {
            return val;
        }
        private boolean getResult(TreeNode root, TreeNode p, TreeNode q){
            if (root==null) return false;
            int a= getResult(root.left,p,q) ? 1 : 0;
            int b =getResult(root.right,p,q)? 1 : 0;
            int mid = (root==p || root==q)  ? 1 : 0;
            if (mid+b+a >=2){
                this.result=root;
            }
            return (a+b+mid>0);

        }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
            this.getResult(root,p,q);
            return this.result;
        }
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
//       List<Integer> a= getAncestor(root,p);
//       List<Integer> b = getAncestor(root,q);
//       int temp=0;
//       for (int i=0; i<a.size();i++){
//           for (int j=0; j<b.size();j++){
//               if (a.get(i)==b.get(j)){
//                   temp=a.get(i);
//               }
//           }
//       }
//       TreeNode node = new TreeNode(temp);
//       return node;
//    }
//    public List<Integer> getAncestor(TreeNode root,TreeNode target){
//        List<Integer> result =new ArrayList<>();
//        getAncestor(root,target,result);
//        return result;
//    }
//    private boolean getAncestor(TreeNode node,TreeNode target,List<Integer> result){
//        if (node==null) return false;
//        if (node==target) return true;
//        if (getAncestor(node.left,target,result)||getAncestor(node.right,target,result)){
//            result.add(node.val);
//            return true;
//        }
//        return false;
//    }
}
