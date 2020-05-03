package com.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNoneRepeated {
    public Character findFirstNoneRepeated(String string){
        Map<Character, Integer> map =new HashMap<>();
        int length=string.length();
        for (int i=0;i<length;i++){
            char c = string.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        for (int i=0; i<length;i++) {
            char d = string.charAt(i);
            if (map.get(d) == 1) {
                return d;
            }
        }return null;
    }


    public static void main(String[] args){
        System.out.println("Please enter your input:");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        FindFirstNoneRepeated findFirstNoneRepeated=new FindFirstNoneRepeated();
        char c= findFirstNoneRepeated.findFirstNoneRepeated(s);
        System.out.println("The first non repeated char is: "+c);

    }
}
