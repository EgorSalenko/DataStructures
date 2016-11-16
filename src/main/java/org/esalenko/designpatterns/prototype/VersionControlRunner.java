package org.esalenko.designpatterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "MyProject", "SourceCode sourcecode = new SourceCode()");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("=======================");
        System.out.println(masterClone);
    }
}
