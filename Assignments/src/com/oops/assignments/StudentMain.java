package com.oops.assignments;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = scanner.nextInt();
        for (int i = 1; i < numberOfStudents + 1; i++) {
            System.out.println("Enter the name of the Student " + i);
            String name = scanner.next();
            System.out.println("Enter the Department of the Student " + i);
            String department = scanner.next();
            Student student = new Student(name, department);
            student.printDetails();
            System.out.println("Enter the number of Subjects");
            int noOfSubjects = scanner.nextInt();
            System.out.println("Enter the marks of each subject");
            int[] mark = new int[noOfSubjects];
            for (int j = 0; j < mark.length; j++) {
                mark[i] = scanner.nextInt();
            }
            System.out.println(student.getGrades(mark));
        }
    }

}
