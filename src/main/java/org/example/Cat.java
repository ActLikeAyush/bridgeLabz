package org.example;

public class Cat {
    private int age;
    private  String name;
    Cat(){
       this.age=0;
       this.name="";
    }
    public Cat(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
}
