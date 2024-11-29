package Threads;
class A extends Thread{
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("f1");
            try {
                Thread.sleep(6);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("f2");
            try {
                Thread.sleep(6);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class FirstClass {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(obj2.getPriority());
        obj1.start();
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        obj2.start();
    }
}
