package com.generics;

public class User implements Comparable <User>{
    private int points;

    public User() {
        System.out.println("user non param constructor");
    }

    public int getPoints() {
        return points;
    }


    public User(int points) {
        System.out.println("user param constructor");

        this.points = points;
    }

    @Override
    public int compareTo(User user) {
        return(points-user.points);
    }
    @Override
    public String toString(){
        return "Points="+points;
    }
}
