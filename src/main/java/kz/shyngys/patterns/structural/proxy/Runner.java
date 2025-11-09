package kz.shyngys.patterns.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        Car car = new CarProxy("toyota");
        car.move();
    }
}
