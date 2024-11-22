package DesignPattern.SingleTonDesignPattern;

public class TestMain {
    public static void main(String[] args) {
//        SingleTon s=new SingleTon();
//        using lazy way
          SingleTon obj1=SingleTon.getSingleTon();
          System.out.println(obj1.hashCode());
          SingleTon obj2=SingleTon.getSingleTon();
          System.out.println(obj2.hashCode());

//          using eager way

           SingleTon obj3=SingleTon.eagerWayObj();
           System.out.println(obj3.hashCode());
           SingleTon obj4=SingleTon.eagerWayObj();
           System.out.println(obj4.hashCode());
    }
}
