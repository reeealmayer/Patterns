package kz.shyngys.patterns.creational.factory_method;

public class ToyotaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
