package org.esalenko.designpatterns.factorymethod;

public class TruckDriverFactory implements DriverFactory{
    public Driver createDriver() {
        return new TruckDriver();
    }
}
