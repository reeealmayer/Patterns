package kz.shyngys.patterns.creational.factory_method;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = getFactory("mazda");
        Car car = carFactory.createCar();
        car.move();
    }

    static CarFactory getFactory(String name) {
        if (name.equalsIgnoreCase("toyota")) {
            return new ToyotaFactory();
        } else if (name.equalsIgnoreCase("mazda")) {
            return new MazdaFactory();
        } else {
            throw new RuntimeException("name is unknown");
        }
    }
}
