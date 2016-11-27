package org.esalenko.designpatterns.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.add(firstJavaDeveloper);
        team.add(secondJavaDeveloper);
        team.add(cppDeveloper);

        team.createProject();
    }
}
