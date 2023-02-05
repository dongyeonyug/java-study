package com.example.util;

public class Calculator {

    public int plus(int x,int y){
        return x+y;
    }

    public int minus(int x,int y){
        return x-y;
    }

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        int value=cal.plus(3,4);
        System.out.println(value);
    }
}
