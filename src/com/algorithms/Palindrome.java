package com.algorithms;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    List<List<String>> result=new ArrayList<>();
    ArrayList<String> store =new ArrayList<>();
    public List<List<String>> partition(String string){
        backTracking(string,0);
        return result;
    }
    public boolean checkPalindrome(String string,int l,int r){
        if (l==r) return true;
        while(l<r){
            if (string.charAt(l)!=string.charAt(r)) return false;
            l++;
            r--;
        }return true;
    }

    public void backTracking(String string, int l){
        if (store.size()>0 && l>=string.length()){
            List<String> a = new ArrayList<>();
            a= (List<String>) store.clone();
            result.add(a);
        }
        for (int i=l;i<string.length();i++){
            if (checkPalindrome(string,l,i)){
                store.add(string.substring(l,i+1));
                backTracking(string,i+1);
                store.remove(store.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.partition("aab"));
    }

}
