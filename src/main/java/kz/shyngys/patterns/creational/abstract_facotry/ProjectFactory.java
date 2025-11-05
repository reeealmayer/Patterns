package kz.shyngys.patterns.creational.abstract_facotry;

public interface ProjectFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
