package kz.shyngys.patterns.creational.builder;

public class ToyotaCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Toyota");
    }

    @Override
    void buildPrice() {
        car.setPrice(1000);
    }

    @Override
    void buildVolume() {
        car.setVolume(2);
    }
}
