package com.oops.inheritance;

public class TeamOne extends Project{
    String techStack ;

    public TeamOne(String projectName, int durationinMonths, String domian, String projectManager, String techStack) {
        super(projectName, durationinMonths, domian, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String[] skills = {"Java","Spring","JDBS","Servlets"};
        return skills;
    }
}

