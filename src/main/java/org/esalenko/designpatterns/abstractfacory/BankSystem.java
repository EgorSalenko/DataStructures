package org.esalenko.designpatterns.abstractfacory;

import org.esalenko.designpatterns.abstractfacory.banking.BankingTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system..");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
