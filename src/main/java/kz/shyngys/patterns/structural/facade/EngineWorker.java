package kz.shyngys.patterns.structural.facade;

public class EngineWorker {
    public void repairCar(Car car) {
        if (car.isNeededToRepair()) {
            System.out.println("Worker is repairing car");
        } else {
            System.out.println("Worker is chilling");
        }
    }
}
