package FileHandling;

import javax.imageio.IIOException;
import java.io.File;

public class SecondClass {

    public static void someImportantMethod(){
        try{
            File f=new File("C:/Users/HP/OneDrive/Desktop/FileHandling.txt");
            if(f.exists()){
                System.out.println("File name: "+f.getName());
                System.out.println("File Path: "+f.getAbsolutePath());
                System.out.println("File Writable: "+f.canWrite());
                System.out.println("File Readable: "+f.canRead());
                System.out.println("File Size: "+f.length());
                System.out.println("For Deleting File: "+f.delete());
            }
            else{
                System.out.println("File not Exists....");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        SecondClass.someImportantMethod();

        try{

        File f=new File("C:/Users/HP/OneDrive/Desktop/FileHandling.txt") ;
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is already exist ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
