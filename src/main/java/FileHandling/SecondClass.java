package FileHandling;

import javax.imageio.IIOException;
import java.io.File;

public class SecondClass {

    public static void someImportantMethod()

    public static void main(String[] args) throws IIOException {

        try{

        File f=new File("src/main/java/FileHandling/new.txt") ;
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
