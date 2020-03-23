package com.Hange;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        int [] alist = {1,2,6,5,4,3,7,123,76,43,21,21};
        List<Integer> blist = new ArrayList<Integer>();
        Arrays.stream(alist).forEach(i->{
            blist.add(i);
        });
        Collections.sort(blist);
        System.out.println(blist);

//        List<Integer> list = Arrays.stream(alist).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        System.out.println(list);
    }
}
