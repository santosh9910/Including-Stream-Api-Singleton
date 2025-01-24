package com.general.project;

@FunctionalInterface
interface MyClass{
    public int execute(int i, int j);
}

public class Main {
    public static void main(String[] args) {
        MyClass myclass = (int a, int b)->{
            System.out.println("Inside Main method ");
            return a+b;
        };
        System.out.println(myclass.execute(4,6));
        System.out.println("Hello, World!");
    }
}