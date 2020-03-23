package com.inheritance;

public class Dog extends Animal {
    public Dog(Animal aaa) {
        System.out.println("wang");
    }
    public void run (){
        System.out.println("run");
    }

    public Dog() {
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Dog dog = new Dog(cat);
    }
}


