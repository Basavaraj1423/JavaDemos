package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EventDemo {
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18 , 19, 20);
        List<Integer> evenNoList = new ArrayList<>();
        for (int num : numlist) {
            if (num % 2 == 0) {
                evenNoList.add(num);
            }
        }
        Iterator<Integer> iterator = evenNoList.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.print(" "+val);
        }
    }
}
