package DesignPattern.AbstractDesignPattern;

public class AndroDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
