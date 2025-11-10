package kz.shyngys.patterns.behavioral.command;

public class DestroyCommand implements Command {
    CarFactory carFactory;

    public DestroyCommand(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @Override
    public void execute() {
        carFactory.destroyCar();
    }
}
