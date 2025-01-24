package com.general.project;

 class ParentMethodHiding {
     static void hiding(){
        System.out.println("This is a ParentMethodHiding class");
    }
}
class ChildMethodHiding extends ParentMethodHiding{
    static void hiding(){
        System.out.println("This is a ChildMethodHiding class");
     }
}
public class StaticMethodHiding{
    public static void main(String[] args) {
        ParentMethodHiding obj1 = new ParentMethodHiding();
        obj1.hiding();

        ParentMethodHiding obj2 = new ChildMethodHiding(); //This is the concept of StaticMethodHiding
        obj2.hiding();

        ChildMethodHiding obj3 = new ChildMethodHiding();
        obj3.hiding();
    }
}

