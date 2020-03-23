package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d"); //d will go to the end of the que
        //1-3 cab
        String front= queue.peek();
        System.out.println(front);



    }
}
