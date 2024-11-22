package DesignPattern.factoryDesignPattern;

public class WebDeveloper implements Employee{
    public int EmployeeSalary(){
        System.out.println("getting salary of web developer");
        return 60000;
    }
}
