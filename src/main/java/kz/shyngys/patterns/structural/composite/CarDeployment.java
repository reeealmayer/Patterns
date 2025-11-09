package kz.shyngys.patterns.structural.composite;

public class CarDeployment {
    public static void main(String[] args) {
        Team team = new Team();

        Worker firstEngineWorker = new EngineWorker();
        Worker secondEngineWorker = new EngineWorker();
        Worker wheelWorker = new WheelWorker();

        team.addWorker(firstEngineWorker);
        team.addWorker(secondEngineWorker);
        team.addWorker(wheelWorker);

        team.createCar();
    }
}
