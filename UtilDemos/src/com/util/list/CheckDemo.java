package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruitlist = new ArrayList<>();
        List<String> nameStartsWithA = new ArrayList<>();
        fruitlist.add("Apple");
        fruitlist.add("Apple-2");
        fruitlist.add("orrange");
        fruitlist.add("Mango");
        fruitlist.add("Grapes");
        for(String fruits : fruitlist){
            if(fruits.startsWith("A")){
                nameStartsWithA.add(fruits);
            }
        }
        Iterator<String> iterator = nameStartsWithA.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
