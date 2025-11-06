package kz.shyngys.patterns.creational.singleton;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println(SingleBook.getInstance());
        System.out.println(SingleBook.getInstance());
        System.out.println(SingleBook.getInstance());
        System.out.println(SingleBook.getInstance());
        System.out.println(SingleBook.getInstance());
        System.out.println(SingleBook.getInstance());
    }
}
