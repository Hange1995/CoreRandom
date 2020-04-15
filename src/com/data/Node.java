package com.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    private int value;
    private Node root;
    private Node leftNext;
    private Node rightNext;
    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public void preOrderTraverse(Node root){
        if (root==null) return;
        System.out.println(root.value);
        preOrderTraverse(root.leftNext);
        preOrderTraverse(root.rightNext);
    }
    public void inOrderTraverse(Node root){
        if (root==null) return;
        inOrderTraverse(root.leftNext);
        System.out.println(root.value);
        inOrderTraverse(root.rightNext);
    }
    public void postOrderTraverse(Node root){
        if (root==null) return;;
        postOrderTraverse(root.leftNext);
        postOrderTraverse(root.rightNext);
        System.out.println(root.value);
    }

    public List<List<Integer>> bfs(Node root){
        Queue<Node> queue=new LinkedList<>();
        List<List<Integer>> result =new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++) {
                Node node = queue.poll();
                list.add(node.value);
                if (node.leftNext != null) {
                    queue.offer(node.leftNext);
                }
                if (node.rightNext != null) {
                    queue.offer(node.rightNext);
                }
            }
            result.add(list);
        }
        return result;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }


    public static void main(String[] args) {
        Node root = new Node(5);
        Node left = new Node(4);
        Node right = new Node(1);
        root.leftNext = left;
        root.rightNext = right;
        left.leftNext = new Node(3);
        left.rightNext = new Node(2);
        right.rightNext=new Node(2);
        Node digest = new Node();
        System.out.println(digest.bfs(root));
    }
}
