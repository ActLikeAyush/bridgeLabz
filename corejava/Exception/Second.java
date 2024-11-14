import java.io.BufferedReader;
import java.io.FileReader;

class Second{
     static void name() throws Exception  {
       
         FileReader fl=new FileReader("FirstProgram.java");
        BufferedReader bfs=new BufferedReader(fl);
        System.out.println(bfs);
        
        
        // throw new ArrayIndexOutOfBoundsException("use less value to get output");
        
    }
    public static void main(String[] args) throws Exception{
        name();
    }
}