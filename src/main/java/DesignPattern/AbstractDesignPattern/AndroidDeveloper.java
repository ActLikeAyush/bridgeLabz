package DesignPattern.AbstractDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {
        System.out.println("Hy there i am an Android Developer");
        return "SomeOne";
    }
}
