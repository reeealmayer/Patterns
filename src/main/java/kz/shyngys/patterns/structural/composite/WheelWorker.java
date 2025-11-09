package kz.shyngys.patterns.structural.composite;

public class WheelWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("Wheel worker builds car...");
    }
}
