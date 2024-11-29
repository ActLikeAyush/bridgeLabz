package Threads;
class PrintClass{

    public void printMessage(int turns,String msg){
        for(int i=0;i<turns;i++){
            System.out.println(msg+" is printing  "+i);
        }
    }
}

class RunMyClass extends Thread{
    PrintClass pcRef;
    RunMyClass(PrintClass p){
        pcRef=p;
    }

    @Override
    public void run() {
        pcRef.printMessage(20,"Running My Class*******");
    }
}


class RunYourClass extends Thread{
    PrintClass pcRef;
    RunYourClass(PrintClass p){
        pcRef=p;
    }

    @Override
    public void run() {
        pcRef.printMessage(20,"Running Your Class........");
    }
}


public class SixthClass {
    public static void main(String[] args) {
        System.out.println("........... Starting the program ...........");
        PrintClass pc=new PrintClass();
        pc.printMessage(10,"hy this is me main thread ");
        RunMyClass rmc=new RunMyClass(pc);
        RunYourClass ryc=new RunYourClass(pc);
        rmc.start();
        ryc.start();
        System.out.println("........... Ending the program ...........");
    }
}
