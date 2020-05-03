package com.algorithms;

import java.util.HashSet;

public class UniqueString {
    public boolean uniqueString(String string){
        boolean result=false;
        HashSet<Character> hashSet=new HashSet<>();
        for (int i=0;i<string.length();i++){
            if (hashSet.contains(string.charAt(i))) return result;
            hashSet.add(string.charAt(i));
        }return true;
    }

    public boolean uniqueString2(String string){
        boolean result=false;
        for (char c:string.toCharArray()){
            if (string.indexOf(c)!=string.lastIndexOf(c)) return result;
        }return true;
    }


    public static void main(String[] args) {
        UniqueString uniqueString=new UniqueString();
        System.out.println(uniqueString.uniqueString2("abcd"));
    }
}
