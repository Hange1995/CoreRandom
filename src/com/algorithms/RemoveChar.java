package com.algorithms;

import com.generics.List;

import java.util.ArrayList;

public class RemoveChar {
    public String remove(String org,String move){
        char[] move1=move.toCharArray();
        char[] org1=org.toCharArray();
        for(int i=0;i<move1.length;i++){
            for(int j=0;j<org1.length;j++){
                if(org1[j]==move1[i]){
                    org1=remove1(org1,j);
                    break;
                }
            }
        }
        return String.valueOf(org1);

    }
    public char[] remove1(char[] orgchar ,int k){
        char[] result=new char[orgchar.length-1];
        for(int i=0;i<k;i++){
            result[i]=orgchar[i];
        }
        for(int i=k;i<result.length;i++){
            result[i]=orgchar[i+1];
        }
        return result;
    }



    public static void main(String[] args) {
        String a="aebcdefggg";

        RemoveChar removeChar=new RemoveChar();
//        System.out.println(removeChar.removeChar(a,"fg"));
        System.out.println(removeChar.remove(a,"efg"));
    }
}
