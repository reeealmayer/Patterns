package kz.shyngys.patterns.structural.proxy;

public class CarImpl implements Car {
    private String name;

    public CarImpl(String name) {
        this.name = name;
        createCar();
    }

    public void createCar() {
        System.out.println("Creating car " + name);
    }

    @Override
    public void move() {
        System.out.println("Car " + name + " is moving");
    }
}
