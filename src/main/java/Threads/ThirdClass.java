package Threads;
//we can  implement this using lambda expression also
//        because runnable in a functional interface
public class ThirdClass {
    public static void main(String[] args) {
        Runnable obj1= new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("hy everyone this is me"+i);
                    try{
                        Thread.sleep(10);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
//        we can do this for second class as well
//                and we can use lambda expression as well
        Runnable obj2=()->{
                for(int i=0;i<5;i++){
                    System.out.println("hy everyone"+i);
                    try{
                        Thread.sleep(10);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}
