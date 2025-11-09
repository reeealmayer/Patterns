package kz.shyngys.patterns.structural.composite;

public class EngineWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("Enginge worker builds engine...");
    }
}
