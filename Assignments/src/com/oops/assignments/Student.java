package com.oops.assignments;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Student Name" + name);
        System.out.println("Student Department" + department);
    }

    public String getGrades(int... marks) {
        int sum = 0;
        int count = 0;
        for (int mark : marks) {
            sum += mark;
            count++;
        }
        int average = sum / count;
        System.out.println(average);
        if (average >= 90)
            return "Grade A";
        else if (average >= 80)
            return "Grade B";
        else if (average >= 70)
            return "Grade C";
        else if (average >= 60)
            return "Grade D";
        else
            return "Fail";
    }

}
