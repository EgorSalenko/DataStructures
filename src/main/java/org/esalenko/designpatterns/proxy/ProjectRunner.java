package org.esalenko.designpatterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.gihub.com/EgorSalenko/realProject");
        project.runner();

    }
}
