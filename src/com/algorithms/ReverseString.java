package com.algorithms;

public class ReverseString {
    public void reverseString(String string){
        StringBuilder input1 = new StringBuilder();
        input1.append(string);
        input1=input1.reverse();
        System.out.println(input1);

    }
    public void reverseString2(String string){
        char[] a=string.toCharArray();
        for (int left=0,right= a.length-1;left<right;left++,right--){
            char temp=a[right];
            a[right]=a[left];
            a[left]=temp;
        }
        System.out.println(a);
    }

    public String reverseString3(String string){
        if (string.isEmpty()){
            return string;
        }
        return reverseString3(string.substring(1))+string.charAt(0);
    }


    public static void main(String[] args) {
        String a="abcd 1234";
        ReverseString reverseString=new ReverseString();
//        reverseString.reverseString2(a);
        String reversedString = reverseString.reverseString3(a);
        System.out.println(reversedString);
    }
}
