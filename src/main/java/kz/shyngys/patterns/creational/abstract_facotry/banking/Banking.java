package kz.shyngys.patterns.creational.abstract_facotry.banking;

import kz.shyngys.patterns.creational.abstract_facotry.Developer;
import kz.shyngys.patterns.creational.abstract_facotry.Manager;
import kz.shyngys.patterns.creational.abstract_facotry.ProjectFactory;
import kz.shyngys.patterns.creational.abstract_facotry.Tester;

public class Banking {
    public static void main(String[] args) {
        ProjectFactory factory = new BankingProjectFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        Manager manager = factory.getManager();

        developer.writeCode();
        tester.test();
        manager.manageProject();
    }
}
