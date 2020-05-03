package com.algorithms;

public class CountWord {
    public void countWord(String string){
        System.out.println(string.trim().split("\\s+").length);
    }

    public static void main(String[] args) {
        CountWord countWord=new CountWord();
        countWord.countWord("Hello World  1 2 3");
    }
}
