package org.esalenko.designpatterns.abstractfacory.website;

import org.esalenko.designpatterns.abstractfacory.Developer;
import org.esalenko.designpatterns.abstractfacory.ProjectManager;
import org.esalenko.designpatterns.abstractfacory.ProjectTeamFactory;
import org.esalenko.designpatterns.abstractfacory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
