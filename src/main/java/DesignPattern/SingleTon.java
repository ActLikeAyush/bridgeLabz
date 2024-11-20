package DesignPattern;

public class SingleTon {
    private static SingleTon ObjOfSingleTon;
    private SingleTon(){
//        after makeing this constructor private we can not create object of this class
    }
    public static SingleTon getSingleTon(){

        if(ObjOfSingleTon==null){
            ObjOfSingleTon=new SingleTon();
        }

        return ObjOfSingleTon;
    }
}

//here we want to create only one object of this class and we want to reuse it multiple time...