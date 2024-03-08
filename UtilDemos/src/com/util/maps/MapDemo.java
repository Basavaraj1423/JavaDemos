package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
       // Map<Integer, String> stringMap = new LinkedHashMap<>();
        //Map<Integer, String> stringMap = new TreeMap<>();



        stringMap.put(1, "Java");
        stringMap.put(10, "Spring");
        stringMap.put(8, "Node");
        stringMap.put(null, "Css");
        stringMap.put(5, "Html");
        stringMap.put(1, "React");
        stringMap.put(100, null);
        stringMap.put(101, null);
        System.out.println(stringMap);

        System.out.println(stringMap.get(1));
        System.out.println(stringMap.get(102));
        System.out.println(stringMap.getOrDefault(102, "JSP"));
        System.out.println(stringMap.containsKey(1));
        stringMap.values();

        System.out.println();

        Set<Integer> keys = stringMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + stringMap.get(key));
        }
        System.out.println();

        System.out.println("Using Entry Set");
        Set<Map.Entry<Integer, String>> entries = stringMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
