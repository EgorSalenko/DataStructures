package org.esalenko.designpatterns.factorymethod;

public class Ride {
    public static void main(String[] args) {
        DriverFactory driverFactory = createDriverByType("truck");

        Driver driver = driverFactory.createDriver();

        driver.ride();
    }

    static DriverFactory createDriverByType(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new CarDriverFactory();
        } else if (type.equalsIgnoreCase("truck")) {
            return new TruckDriverFactory();
        } else {
            throw new RuntimeException(type + " there is unknown type of driver");
        }
    }
}
