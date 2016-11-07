package org.esalenko.designpatterns.abstractfacory.website;

import org.esalenko.designpatterns.abstractfacory.Developer;

public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("PHP developer writes php code");
    }
}
