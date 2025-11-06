package kz.shyngys.patterns.creational.builder;

public class MazdaCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("mazda");
    }

    @Override
    void buildPrice() {
        car.setPrice(500);
    }

    @Override
    void buildVolume() {
        car.setVolume(1);
    }
}
