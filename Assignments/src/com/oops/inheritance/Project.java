package com.oops.inheritance;

public class Project {
    String ProjectName;
    int durationinMonths;
    String domian;
    String projectManager;


    public Project(String projectName, int durationinMonths, String domian, String projectManager) {
        this.ProjectName = ProjectName;
        this.durationinMonths = durationinMonths;
        this.domian = domian;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
        System.out.println(ProjectName);
        System.out.println(durationinMonths);
        System.out.println(domian);
        System.out.println(projectManager);
    }
}
