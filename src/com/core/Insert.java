package com.core;

import java.util.ArrayList;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(4);
        Insert insertM=new Insert();
        insertM.insert(a,3,0);
        System.out.println(a);
    }
    ArrayList<Integer> insert(ArrayList<Integer> list,int m,int i){
        if (i<list.size() && m>list.get(i)){
            i=i+1;
            return insert(list,m,i);
        } list.add(i,m);
        return list;
    }
}
