package kz.shyngys.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> cars = new ArrayList<>();

        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("toyota"));
        cars.add(carFactory.getCarByName("mazda"));
        cars.add(carFactory.getCarByName("mazda"));
        cars.add(carFactory.getCarByName("mazda"));
        cars.add(carFactory.getCarByName("mazda"));
        cars.add(carFactory.getCarByName("mazda"));

        for (Car car : cars) {
            car.move();
        }
    }
}
