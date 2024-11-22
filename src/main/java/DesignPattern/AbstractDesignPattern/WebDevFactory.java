package DesignPattern.AbstractDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}
