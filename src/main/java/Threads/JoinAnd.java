package Threads;

class kuchBhi extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("kuch bhi"+i);
        }
    }
}

public class JoinAnd {
    public static void main(String[] args) {
        Runnable abc=()->{
          for(int i=0;i<10;i++){
              System.out.println("Runnable "+i);
          }
        };


    Thread th=new Thread(abc);
    kuchBhi obj=new kuchBhi();
    th.start();


    obj.start();
    }
}
