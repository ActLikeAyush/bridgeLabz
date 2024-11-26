package BasicLogicalQuestions;

import DesignPattern.BuilderDesignPattern.Main;

import java.util.Scanner;
import java.util.TimeZone;

public class elapseTime {
    public static long start(){
        long time=System.currentTimeMillis();
        System.out.println("StopWatch started");
        return time;
    }
    public static long stop(long timeS){
        long time =System.currentTimeMillis();
        System.out.println("Stopwatch stop");
        time=time-timeS;
        return time;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 to start time \n 1 for stop time \n 2 for exit...... ");
        int n=0;
        long timeS=0,timeE=0;
        while(n<=2){
            n= sc.nextInt();
            if(n==0){
                timeS=elapseTime.start();
            } else if (n==1) {
                timeE=elapseTime.stop(timeS);
                System.out.println("Time is "+timeE);
            } else if (n==2) {
                System.out.println("Exit...............");
                break;
            }
        }

    }
}
