package DesignPattern.AbstractDesignPattern;

public class Customer {
    public static void main(String[] args) {
        Employee e1=EmployeeFactory.createEmployee(new WebDevFactory());
        e1.getName();
        System.out.println(e1.getSalary());
        Employee e2=EmployeeFactory.createEmployee(new AndroDevFactory());
        e2.getName();
        System.out.println(e2.getSalary());
    }
}
