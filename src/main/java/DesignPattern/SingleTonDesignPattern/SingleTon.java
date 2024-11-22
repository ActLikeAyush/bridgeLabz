package DesignPattern.SingleTonDesignPattern;

//here we want to create only one object of this class and we want to reuse it multiple time...
public class SingleTon {

    private SingleTon(){ /* after makeing this constructor private we can not create object of this class */}



//    eager way to create single ton object creation

//    just create one static variable and create an object inside that variable
    private static SingleTon eagerWay=new SingleTon();
//    return that variable in side the static method
//    when ever user call this method object will be created
    public static SingleTon eagerWayObj(){
        return eagerWay;
    }


//    lazy way to create object of single ton pattern object
//    create one static variable
    private static SingleTon ObjOfSingleTon;
//    create on static method by using this method user can get the object
    public static SingleTon getSingleTon(){
//        we need to create object only once that's why we checking the condition
        if(ObjOfSingleTon==null){
            ObjOfSingleTon=new SingleTon();
        }
        return ObjOfSingleTon;
    }

//    here is one problem it is good until we did not use multi threading
//    for solution me can do
//    for making it synchronized
    private static SingleTon SycObj;

    public static SingleTon getObjOfSingleTon2() {
       if(SycObj==null) {

           synchronized (SingleTon.class) {
               SycObj=new SingleTon();
           }

       }

       return SycObj;

    }

}

