package org.example;

public class optionals {
    public static void main(String args[]){
        Cat mycat=findCatName("tom");
        System.out.println(mycat.getAge());
    }
    private static Cat findCatName(String name){
        Cat cat=new Cat(name,3);
        return null;
    }
}
