package com.general.project;


interface Animal{
    void eat();
}
interface Cat {
    void walk();
}
class Dog implements Animal,Cat{
    public void walk(){
        System.out.println("Dog bark");
    }
    public void eat(){
        System.out.println("Eat method ");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.walk();
    }
}
