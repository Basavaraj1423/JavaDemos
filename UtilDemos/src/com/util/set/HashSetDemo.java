package com.util.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //Set<String > stringSet = new HashSet<>();
        //Set<String > stringSet = new LinkedHashSet<>();

        List<Integer> numlist = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18 , 19, 20);

        Set<String > stringSet = new TreeSet<>();
        stringSet.add("Game of Thrones");
        stringSet.add("Danarys Targereon");
        stringSet.add("Aegon Targereon");
        stringSet.add("Tyrion Lannister");
        stringSet.add("Rob Stark");
        stringSet.add("100");
        //stringSet.add(null);
        System.out.println(stringSet);
        for (String element:stringSet ) {
            System.out.println(element);
        }

        List<String> fruits = Arrays.asList("Apple","Orrange","Apple");
        System.out.println("The List:"+fruits);
        Set<String> newfruits = new HashSet<>(fruits);
        System.out.println("The Set:"+newfruits);

    }
}
