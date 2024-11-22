package DesignPattern.ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.channels.Channel;

public class Test {
    public static void main(String[] args) throws Exception{
        myChannel channel=new myChannel();



        BufferedReader brf=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter 1 to upload");
            System.out.println("Enter 2 to subscribe");
            System.out.println("Enter 3 to exit");
            int c= Integer.parseInt(brf.readLine());
            if(c==1){
                System.out.println("Enter Title of notification");
                String title=brf.readLine();
                channel.notifyChanges(title);
            } else if (c==2) {
                System.out.println("Enter name of subscriber");
                String nameOf=brf.readLine();
                Subscribe sub1=new Subscribe(nameOf);
                channel.subscribe(sub1);
            }
            else if(c==3){
                System.out.println("thanks for coming ");
                break;
            }
            else{
                System.out.println("wrong input");
            }
        }
    }
}
