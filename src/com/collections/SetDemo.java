package com.collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemo {
    public static void show(){
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection,"a","b","c","c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);
        Set<String> set= new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2= new HashSet<>(Arrays.asList("b","c","d"));
        //Union, combination of two set.
//        set.addAll(set2);
//        System.out.println(set);
        //Intersection, common in both side
//        set.retainAll(set2);
//        System.out.println(set);
        //Difference, what have in the first but not have in second
        set.removeAll(set2);
        System.out.println(set);


    }
}
