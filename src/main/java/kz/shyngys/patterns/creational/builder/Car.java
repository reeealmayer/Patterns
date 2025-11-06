package kz.shyngys.patterns.creational.builder;

public class Car {
    private String name;
    private int price;
    private int volume;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
