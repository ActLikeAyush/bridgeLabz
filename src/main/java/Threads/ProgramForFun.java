package Threads;
class PrintClass1{

    public void printMessage(int turns,String msg){
        for(int i=0;i<turns;i++){
            System.out.println(msg+" is printing  "+i);
        }
    }
}

class RunMyClass1 extends Thread{
    PrintClass pcRef;
    RunMyClass1(PrintClass p){
        pcRef=p;
//        Thread t=new Thread();
        System.out.println(Thread.currentThread());
    }

    @Override
    public void run() {
        pcRef.printMessage(20,"Running My Class*******");
    }
}


class RunYourClass1 extends Thread{
    PrintClass pcRef;
    RunYourClass1(PrintClass p){
        pcRef=p;
    }

    @Override
    public void run() {
        pcRef.printMessage(20,"Running Your Class........");
    }
}


public class ProgramForFun {
    public static void main(String[] args) {
        System.out.println("........... Starting the program ...........");
        PrintClass pc=new PrintClass();
        pc.printMessage(10,"hy this is me main thread ");
        RunMyClass1 rmc=new RunMyClass1(pc);
        RunYourClass1 ryc=new RunYourClass1(pc);
        rmc.start();
        ryc.start();
        System.out.println("........... Ending the program ...........");
    }
}
