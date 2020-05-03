package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionOfTwoArray {
    public int[] findIntersectionOfTwoArray(int[] a,int[] b){
        int[] temp= new int[a.length+b.length];
        int z=0;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    temp[z]=a[i];
                    z++;
                }
            }
        }return temp;
    }
}
