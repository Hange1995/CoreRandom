package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
        Collections.addAll(list,"a","b","C");
        System.out.println(list.get(2).toLowerCase());
    }
}
