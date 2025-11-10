package kz.shyngys.patterns.behavioral.command;

public class CreateCommand implements Command {
    public CreateCommand(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    CarFactory carFactory;
    @Override
    public void execute() {
        carFactory.createCar();
    }
}
