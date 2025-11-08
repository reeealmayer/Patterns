package kz.shyngys.patterns.structural.bridge;

public abstract class Program {
    protected ProgramDeveloper developer;

    protected Program(ProgramDeveloper developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
