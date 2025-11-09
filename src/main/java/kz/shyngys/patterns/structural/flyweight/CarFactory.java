package kz.shyngys.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<>();

    Car getCarByName(String name) {
        Car car = cars.get(name);
        if (car == null) {
            switch (name) {
                case "toyota":
                    System.out.println("Creating toyota");
                    car = new Toyota();
                    break;
                case "mazda":
                    System.out.println("Creating mazda");
                    car = new Mazda();
                    break;
            }
            cars.put(name, car);
        }
        return car;
    }
}
