package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("c");
//        collection.add("b");
        Collections.addAll(collection,"a","b","c");
        for (String item : collection)
            System.out.println(item);
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));
    }


}
