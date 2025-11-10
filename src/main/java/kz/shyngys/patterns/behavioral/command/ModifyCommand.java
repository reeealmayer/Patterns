package kz.shyngys.patterns.behavioral.command;

public class ModifyCommand implements Command {
    CarFactory carFactory;

    public ModifyCommand(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @Override
    public void execute() {
        carFactory.modifyCar();
    }
}
