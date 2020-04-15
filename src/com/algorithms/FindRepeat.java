package com.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeat {
    public List<Integer> FindTwice(int[] a ){
        List<Integer> c = new ArrayList<>();
        int [] b = new  int[a.length];
        for(int i = 1 ; i<a.length;i++){
            b[a[i]-1]=b[a[i]-1]+1;
        }
        for (int j=1;j<b.length;j++){
            if (b[j]==2){
                c.add(j+1);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int [] test={4,3,2,7,8,3,2,1};
        FindRepeat findRepeat=new FindRepeat();
        System.out.println(findRepeat.FindTwice(test));
        Map<String,String> a = new HashMap<>();
        a.values().stream();
    }
    
}
