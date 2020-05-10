package com.algorithms;

import java.util.HashMap;

public class CountOccurrence {
    public void countOccurrence(String s){
        char[] a =s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:a){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
    }
}
