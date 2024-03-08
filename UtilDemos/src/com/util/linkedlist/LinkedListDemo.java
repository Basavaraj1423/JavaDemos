package com.util.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Danarys Targereon");
        list.add("Aegon Targereon");
        list.add("Tyrion Lannister");
        list.add("Rob Stark");
        System.out.println(list);
        list.addFirst("Game of Thrones");
        list.addLast("There are 8 seasons");
        list.set(1,"No.1 Web Series");
        System.out.println(list);
        System.out.println(list.size());
        //System.out.println(list.get(0));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String webSeries = iterator.next();
            System.out.println(" "+webSeries);
        }

    }
}
