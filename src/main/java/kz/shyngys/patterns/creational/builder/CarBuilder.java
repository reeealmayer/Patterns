package kz.shyngys.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();

    abstract void buildPrice();

    abstract void buildVolume();

    public Car getCar() {
        return car;
    }
}
