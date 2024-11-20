package DesignPattern;

public class TestMain {
    public static void main(String[] args) {
//        SingleTon s=new SingleTon();
          SingleTon obj1=SingleTon.getSingleTon();
          System.out.println(obj1.hashCode());
          SingleTon obj2=SingleTon.getSingleTon();
          System.out.println(obj2.hashCode());
    }
}
