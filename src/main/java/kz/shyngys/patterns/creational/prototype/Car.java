package kz.shyngys.patterns.creational.prototype;

public class Car implements Copyable {
    private String name;
    private int volume;

    public Car(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public Object copy() {
        Car copy = new Car(name, volume);
        return copy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
