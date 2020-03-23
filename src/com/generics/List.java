package com.generics;

public class List {
    private int [] list = new int[10];
    private int count;

    public void add(int item){
        list[count++]=item;
    }
    public int get(int index){
        return list[index];
    }



}
