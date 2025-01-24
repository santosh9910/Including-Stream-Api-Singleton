package com.general.project;

public class EqualsOperator {

    public static void main(String[] args) {
        String name1 = new String("Santosh");
        String name2 = new String("Santosh");

        if(name1 == name2){
            System.out.println("name1 and name2 are equal");
        }else {
            System.out.println("name1 and name2 are not equal");
        }

        if (name1.equals(name2)){
            System.out.println("name1 and name2 are equal");
        }else {
            System.out.println("name1 and name2 are not equal");
        }
    }

}
