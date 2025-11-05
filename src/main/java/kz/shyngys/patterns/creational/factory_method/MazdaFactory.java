package kz.shyngys.patterns.creational.factory_method;

public class MazdaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mazda();
    }
}
