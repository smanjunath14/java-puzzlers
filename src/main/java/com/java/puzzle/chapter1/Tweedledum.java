package com.java.puzzle.chapter1;

public class Tweedledum {

    public static void tweedledum(){
        short x = 0;
        int i = 123456;
        x += i;
        //x = x + i; Doesn't compile... Loss of precision from int to short.


    }
    public static void main(String[] args) {
        tweedledum();
    }
}
