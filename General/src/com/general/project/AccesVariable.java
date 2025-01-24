package com.general.project;

public class AccesVariable {
    public String name = "Public variable";
    private String name1 = "Private variable";
    String name2 = "Default variable";
    protected String name3 = "Protected variable";

     public void publicMethod(){
        System.out.println("I am Public Method");
    }
     private void privateMethod(){
        System.out.println("I am Private Method");
    }
     void defaultMethod(){
        System.out.println("I am Default Method");
    }
     protected void protectedMethod(){
        System.out.println("I am Protected Method");
    }

    public static void main(String[] args) {
        AccesVariable accesVariable = new AccesVariable();
        accesVariable.publicMethod();
        System.out.println(accesVariable.name);
        accesVariable.privateMethod();
        System.out.println(accesVariable.name1);
        accesVariable.defaultMethod();
        System.out.println(accesVariable.name2);
        accesVariable.protectedMethod();
        System.out.println(accesVariable.name3);
    }
}
