package com.oops.inheritance;

public class TeamTwo extends Project{
    String[] tools;

    public TeamTwo(String projectName, int durationinMonths, String domian, String projectManager, String[] tools) {
        super(projectName, durationinMonths, domian, projectManager);
        this.tools = tools;
    }
    void showTools(){
       for (String x:tools){
           System.out.println(x);
       }
        System.out.println();
    }
}
