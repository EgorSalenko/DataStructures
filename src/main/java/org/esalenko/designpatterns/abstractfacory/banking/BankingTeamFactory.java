package org.esalenko.designpatterns.abstractfacory.banking;

import org.esalenko.designpatterns.abstractfacory.Developer;
import org.esalenko.designpatterns.abstractfacory.ProjectManager;
import org.esalenko.designpatterns.abstractfacory.ProjectTeamFactory;
import org.esalenko.designpatterns.abstractfacory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
