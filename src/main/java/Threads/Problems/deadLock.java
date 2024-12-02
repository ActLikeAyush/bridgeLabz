//package Threads.Problems;
//
//
//
//class Company{
//    boolean turn=false;
//    int n;
//    public synchronized void producItem(int n)throws Exception{
//        if(true){
//            wait();

//        }
//        this.n=n;
//        System.out.println("Produce Item is: "+n);
//        notify();
//    }
//
//    public synchronized int consumeItem() throws Exception{
//        if(turn!=true){
//            wait();
//        }
//        System.out.println("Conusme Item is: "+n);
//        turn=true;
//        return this.n;
//    }
//}
//
//
//class Producer extends Thread{
//    Company c;
//    Producer(Company c){
//        this.c=c;
//    }
//    public void run(){
//        int i=1;
//        while(true){
//            this.c.producItem(i);
//            try{ sleep(1000); }catch (Exception e){}
//            i++;
//        }
//    }
//}
//
//
//class Consumer extends Thread{
//    Company c;
//    Consumer(Company c){
//        this.c=c;
//    }
//    public void run(){
//        while (true){
//            this.c.consumeItem();
//            try{ sleep(1200); }catch (Exception e){}
//        }
//    }
//}
//
//
//
//public class deadLock {
//    public static void main(String[] args) {
//        Company comp=new Company();
//        Producer p=new Producer(comp);
//        Consumer c=new Consumer(comp);
//        p.start();
//        c.start();
//    }
//}
//
