package com.java.puzzle.chapter1;

public class Tweedledee {
    public static void tweedledee(){
        Object x = "Hello ";
        String y = "World!";
        //x = x + y;
        x += y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        tweedledee();
    }
}
