package kz.shyngys.patterns.creational.builder;

public class BuilCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new MazdaCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
