package kz.shyngys.patterns.creational.abstract_facotry.banking;

import kz.shyngys.patterns.creational.abstract_facotry.Developer;
import kz.shyngys.patterns.creational.abstract_facotry.Manager;
import kz.shyngys.patterns.creational.abstract_facotry.ProjectFactory;
import kz.shyngys.patterns.creational.abstract_facotry.Tester;
import kz.shyngys.patterns.creational.abstract_facotry.website.ProjectManager;

public class BankingProjectFactory implements ProjectFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
