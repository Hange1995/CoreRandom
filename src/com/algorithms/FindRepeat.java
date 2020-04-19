package com.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeat {
    public List<Integer> findTwice(int[] a ){
        List<Integer> c = new ArrayList<>();
        int [] b = new  int[a.length];
        for(int i = 0 ; i<a.length;i++){
            b[a[i]-1]=b[a[i]-1]+1;
        }
        for (int j=0;j<b.length;j++){
            if (b[j]==2){
                c.add(j+1);
            }
        }
        return c;
    }

    public List<Integer> findDuplicate(int[] a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int index=Math.abs(a[i]);
            if (a[index-1]<0){
                result.add(index);
            }else{
                a[index-1]=-a[index-1];
            }
        }return result;
    }
    public static void main(String[] args) {
        int [] test={4,3,2,7,8,3,2,1};
        FindRepeat findRepeat=new FindRepeat();
        System.out.println(findRepeat.findDuplicate(test));
//        Map<String,String> a = new HashMap<>();
//        a.values().stream();
//        List<Integer> b =new ArrayList<>();


    }

}
