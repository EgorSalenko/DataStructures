package org.esalenko.designpatterns.abstractfacory;

import org.esalenko.designpatterns.abstractfacory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction web site...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
