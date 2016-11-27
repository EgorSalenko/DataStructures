package org.esalenko.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void add(Developer developer) {
        developers.add(developer);
    }

    public void remove(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
