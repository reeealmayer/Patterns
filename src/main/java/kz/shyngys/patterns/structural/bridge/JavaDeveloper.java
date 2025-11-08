package kz.shyngys.patterns.structural.bridge;

public class JavaDeveloper implements ProgramDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
