package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List <String>list = new ArrayList<>();
        list.add("Sansa");
        list.add("Danarys");
        list.add("Robert");
        list.add("RobStark");
        list.set(1,"aegon");
        System.out.println(list);
        list.set(2,"cersi");
        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }
        System.out.println("***********");
        System.out.println("Sorting the list");
        Collections.sort(list);
        for(String val:list){
            System.out.println(val);
        }
    }
}
