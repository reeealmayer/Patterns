package kz.shyngys.patterns.structural.facade;

public class WorkFlow {
    Car car = new Car();
    EngineWorker worker = new EngineWorker();

    public void run() {
        car.setNeededToRepair(true);
        worker.repairCar(car);
        car.setNeededToRepair(false);
        worker.repairCar(car);
    }
}
