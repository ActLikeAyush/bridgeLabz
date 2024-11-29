package Threads;

class NewThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Thread is running ..........");
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println(" thread was interrupted........"+e.getMessage());
        }
    }
}
public class Fifth {
    public static void main(String[] args) {

        NewThread obj=new NewThread();
        obj.start();
        System.out.println("this is true"+obj.isAlive());
        try{
            Thread.sleep(2000);
            System.out.println("iam also running i am main");

        }
        catch (InterruptedException e){
            System.out.println(e+" main thread is also interrupted ");
        }
        obj.interrupt();

    }
}
