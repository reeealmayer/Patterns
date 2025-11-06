package kz.shyngys.patterns.creational.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildPrice();
        builder.buildVolume();

        Car car = builder.getCar();
        return car;
    }
}
