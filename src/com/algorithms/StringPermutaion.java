package com.algorithms;

public class StringPermutaion {
    public static void main(String[] args) {
        StringPermutaion stringPermutaion=new StringPermutaion();
        stringPermutaion.permutation("abc");
    }

    public void permutation(String s){
        permutaion(s.toCharArray(),0);
    }

    private void permutaion(char[] input, int index){
        if (index==input.length){
            System.out.println(input);
        }
        for (int i=index;i<input.length;i++){
            swap(input,i,index);
            permutaion(input,index+1);
            swap(input,i,index);
        }
    }
    public void swap(char[] input, int i, int j){
        char temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }
}
