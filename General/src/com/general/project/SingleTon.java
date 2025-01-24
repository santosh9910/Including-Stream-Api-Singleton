package com.general.project;

public class SingleTon {

    private static SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon sigleTonMethod(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
