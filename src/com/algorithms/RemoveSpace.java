package com.algorithms;

public class RemoveSpace {
    public void removeSpace(String string){
        System.out.println(string.trim().replaceAll("\\s",""));
    }


    public static void main(String[] args) {
        RemoveSpace removeSpace=new RemoveSpace();
        removeSpace.removeSpace("i am iron man");
    }
}
