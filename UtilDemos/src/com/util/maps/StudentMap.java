package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        map.put(new Department("Surya", 101, "CSE"),
                Arrays.asList(new Student("Basava", "Bangalore"),
                        new Student("Arjun", "Mangalore"),
                        new Student("Arjun", "Mangalore")));
        map.put(new Department("Srikanth", 101, "Mech"),
                Arrays.asList(new Student("Chandru", "Mysore"),
                        new Student("Soumya", "Koppal"),
                        new Student("Chinthu", "Gulbarga")));
        map.put(new Department("Naveen", 101, "ECE"),
                Arrays.asList(new Student("Mounika", "Gangavathi"),
                        new Student("Achala", "Hubli"),
                        new Student("SriLakshmi", "Dharwad")));

        System.out.println();

        Set<Department> departments = map.keySet();
        for (Department setOfDepartments : departments) {
            System.out.println(setOfDepartments.getDeptHead()+" "+setOfDepartments.getDeptName());
            List<Student> students = map.get(setOfDepartments);
            for (Student stud : students) {
                System.out.println("Student Name : " + stud.getStudName());
            }

        }


    }
}
