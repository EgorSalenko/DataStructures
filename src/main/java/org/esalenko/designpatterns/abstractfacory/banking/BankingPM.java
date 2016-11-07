package org.esalenko.designpatterns.abstractfacory.banking;

import org.esalenko.designpatterns.abstractfacory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
