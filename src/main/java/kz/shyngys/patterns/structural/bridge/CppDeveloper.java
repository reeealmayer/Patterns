package kz.shyngys.patterns.structural.bridge;

public class CppDeveloper implements ProgramDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code...");
    }
}
