package FileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FirstClass {
    public static void main(String[] args) {
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            System.out.println("Enter latters");
            int latter=isr.read();
            while(isr.ready()){
                System.out.println((char) latter);
                latter= isr.read();

            }
//            isr.close();
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



        try(InputStreamReader isr1=new InputStreamReader(System.in)){
            System.out.println("Enter Somethink you want to convert in char because what ever you are entring through the console is a byte code");
            int ReadLatter=isr1.read();
            while(isr1.ready()){
                System.out.println((char) ReadLatter);
                ReadLatter=isr1.read();
            }
//            isr1.close();
//            we don't need to close it because try and catch block can autometically close it new java 7 feature
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        try(FileReader FR=new FileReader("src/main/java/FileHandling/abc")){
            System.out.println("writing from the file");
            int ReadFile= FR.read();
            while (FR.ready()){
                System.out.println((char) ReadFile);
                ReadFile=FR.read();
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
