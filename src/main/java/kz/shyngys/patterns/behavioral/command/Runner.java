package kz.shyngys.patterns.behavioral.command;

public class Runner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Command createCommand = new CreateCommand(carFactory);
        Command modifyCommand = new ModifyCommand(carFactory);
        Command destroyCommand = new DestroyCommand(carFactory);

        Worker worker = new Worker(
                createCommand,
                modifyCommand,
                destroyCommand
        );

        worker.createCar();
        worker.modifyCar();
        worker.destroyCar();
    }
}
