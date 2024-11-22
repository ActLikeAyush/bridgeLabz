package DesignPattern.AbstractDesignPattern;

public class EmployeeFactory {
    public static Employee createEmployee(EmployeeAbstractFactory factory){
            return factory.createEmployee();
    }
}
