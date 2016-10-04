package org.esalenko.designpatterns.factorymethod;

public class CarDriverFactory implements DriverFactory {
    public Driver createDriver() {
        return new CarDriver();
    }
}
