package com.inter.lam;

public class CourseImplLamda  {
    public static void main(String[] args) {
        ICourse iCourse = ()-> new String[]{"Html,CSS,JS"};
        String[] webTech = iCourse.showCourses();
        for (String webPrint:webTech) {
            System.out.println("The frontend Technologies are :  "+webPrint);
        }
        

        ICourse iCourse2 = ()-> new String[]{"AWS,GogleCloud,Azure"};
        String[] cloud = iCourse2.showCourses();
        for (String cloudPrint:cloud) {
            System.out.println("The cloud Technologies are :  "+cloudPrint);
        }

        ICourse iCourse3 = ()-> new String[]{"Java,Spring,Junit"};
        String[] javaFullStack = iCourse3.showCourses();
        for (String javaPrint:javaFullStack) {
            System.out.println("The Java fullstack is :  "+javaPrint);
        }
    }
}
