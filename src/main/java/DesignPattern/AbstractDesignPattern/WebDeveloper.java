package DesignPattern.AbstractDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 60000;
    }

    @Override
    public String getName() {
        System.out.println("Hy there i am a Web Developer");
        return "SomeOne";
    }
}
