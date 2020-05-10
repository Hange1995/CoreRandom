package com.algorithms;

public class CountNumberOfChar {

    public int count(String s){
        int count =0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' ') {
                count++;
            }
        }return count;
    }


    public int count1(String s){
        int count =0;
        for (int i=0;i<s.length();i++){
            String a = String.valueOf(s.charAt(i));
            if (a.matches("\\w")){
                count++;
            }
        }return count;
    }


    public static void main(String[] args) {
        CountNumberOfChar countNumberOfChar=new CountNumberOfChar();
        System.out.println(countNumberOfChar.count1("hello Hange       !"));
    }

}
