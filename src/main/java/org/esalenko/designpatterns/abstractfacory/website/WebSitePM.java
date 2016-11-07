package org.esalenko.designpatterns.abstractfacory.website;

import org.esalenko.designpatterns.abstractfacory.ProjectManager;

public class WebSitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Web site PM manages web site project");
    }
}
