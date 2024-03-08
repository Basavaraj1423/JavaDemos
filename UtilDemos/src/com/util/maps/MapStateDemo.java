package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bangalore", "Mysore", "Mangalore"));
        stateMap.put("Tamil Nadu", Arrays.asList("Chennai", "Selam", "Madhurai"));
        stateMap.put("Andra Pradesh", Arrays.asList("Kadapa", "Ananthapur", "Chithur"));
        stateMap.put("Kerala ", Arrays.asList("Thiruvananthpuram", "Kochin", "Munnar"));


        for (String stateName : stateMap.keySet()) {
            System.out.println("State: " + stateName);
            List<String> cities = stateMap.get(stateName);
            for (String city : cities) {
                System.out.println("Cities: " + city);
            }
        }
        System.out.println();
    }
}
