package kz.shyngys.patterns.creational.prototype;

public class CarRunner {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 2);
        System.out.println(toyota);
        CarFactory carFactory = new CarFactory(toyota);
        Car copyCar = carFactory.copyCar();
        System.out.println(copyCar);
    }
}
