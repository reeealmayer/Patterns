package kz.shyngys.patterns.structural.proxy;

public class CarProxy implements Car {
    private String name;
    private CarImpl carImpl;

    public CarProxy(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        if (carImpl == null) {
            carImpl = new CarImpl(name);
        }
        carImpl.move();
    }
}
