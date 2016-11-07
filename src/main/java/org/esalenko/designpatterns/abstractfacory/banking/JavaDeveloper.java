package org.esalenko.designpatterns.abstractfacory.banking;

import org.esalenko.designpatterns.abstractfacory.Developer;

public class JavaDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
