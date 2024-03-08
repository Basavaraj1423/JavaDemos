package com.oops.inheritance;

public class ProjectMain {
    public static void main(String[] args) {
        TeamOne teamOne = new TeamOne("policy Bazar",6,"Banking","surya","Java");
        String[] techStack = teamOne.showTechStack();
        teamOne.showProjectDetails();
        for (String tech:techStack) {
            System.out.println(tech);
        }

        TeamTwo teamTwo = new TeamTwo("SBI",4,"Banking","Ajay",new String[]{"Junit","Maven","Json","Docker"});
        teamTwo.showProjectDetails();
        teamTwo.showTools();
    }
}
