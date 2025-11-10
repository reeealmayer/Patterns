package kz.shyngys.patterns.behavioral.command;

public class CarFactory {
    public void createCar() {
        System.out.println("Creating a car");
    }

    public void modifyCar() {
        System.out.println("Modifying a car");
    }

    public void destroyCar() {
        System.out.println("Destroying a car");
    }
}
