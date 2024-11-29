package Threads;

class AllMyThreadPartTwo extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Hello  "+i);
            i++;
        }
    }
}
class AllMyThread extends AllMyThreadPartTwo implements Runnable{

    AllMyThread(){
        super.start();
    }
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("hy this "+i);
            i++;
        }
    }
}
public class ThreadByRunnable {
    public static void main(String[] args) {
        AllMyThread obj1=new AllMyThread();
//        obj1.run();
    }
}
