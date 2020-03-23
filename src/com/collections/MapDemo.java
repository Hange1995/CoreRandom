package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Customer c1 = new Customer("a","e1");
        Customer c2 = new Customer("b","e2");
        Customer c3 = new Customer("c","e3");
        Map<String,Customer> map = new HashMap<>();
        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);
        map.put(c3.getEmail(),c3);
//        Customer unknowncu  = new Customer("Unknown","");
//        Customer customer = map.getOrDefault("e1",unknowncu);
//        System.out.println(customer);
//        Boolean exist = map.containsKey("e10");
//        map.replace("e1",new Customer("a2","e1"));
//        System.out.println(map );
        for (Map.Entry<String, Customer> entry :map.entrySet())
            System.out.println(entry);
    }
}
