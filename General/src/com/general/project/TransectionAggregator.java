package com.general.project;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransectionAggregator {
    public static void main(String[] args) {
        List<Transection> l1= Arrays.asList(
                new Transection("BMW" , 230000),
                new Transection("KIA" , 230000),
                new Transection("BMW" , 230000),
                new Transection("KIA" , 230000));

        Map<String, Integer>totalSummingInt = l1.stream().collect(Collectors.groupingBy(Transection::getType, Collectors.summingInt(Transection::getAmount)));
        System.out.println(totalSummingInt);
    }
}
