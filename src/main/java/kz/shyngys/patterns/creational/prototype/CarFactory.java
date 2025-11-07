package kz.shyngys.patterns.creational.prototype;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    Car copyCar() {
        return (Car) car.copy();
    }
}
