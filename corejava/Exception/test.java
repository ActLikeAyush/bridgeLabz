import java.io.BufferedReader;
import java.io.FileReader;

public class test {
    public static void testing() {
        FileReader fr=new FileReader("Second.java");
        BufferedReader br=new BufferedReader(fr);        
    }
    public static void main(String[] args) {
      testing();
    }
}
