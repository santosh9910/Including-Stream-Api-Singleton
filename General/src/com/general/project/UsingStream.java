package com.general.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStream {


    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(23, 45, 12, 6, 90);
        List<Integer> re= l1.stream().filter(i -> i%2 == 0).map(i->i * i).collect(Collectors.toList());
        System.out.println("Even number is "+re);
    }
}


