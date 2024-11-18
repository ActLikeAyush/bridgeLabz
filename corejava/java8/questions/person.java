package questions;

public class person {
    private String name;
    private int age;
    private double salary;

    person(){

    }
    person(String name,int age,double Salary){
        this.salary=salary;
        this.age=age;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
