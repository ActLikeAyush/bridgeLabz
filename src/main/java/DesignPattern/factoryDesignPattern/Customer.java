package DesignPattern.factoryDesignPattern;

public class Customer {
    public static void main(String[] args) {
//        if we directly make object of both the class so we need to create 2 objects
//            and clint want to know about the implemention of both the classes
//                so it  is tightly coupled classes
//                so we create one factory class which is responsable to create object of it
            Employee emp=factory.getEmployee("Web Developer");
            System.out.println(emp.EmployeeSalary());

            Employee emp2=factory.getEmployee("Android Developer");
            System.out.println(emp2.EmployeeSalary());
    }
}
