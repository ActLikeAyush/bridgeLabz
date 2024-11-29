package Threads;
class F1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hy everyone" + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class F2 implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hy everyone this is me" + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class SecondClass {
    public static void main(String[] args) {
        Runnable obj1 = new F1();
        Runnable obj2 = new F2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
