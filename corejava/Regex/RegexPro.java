import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPro {
     static void regMatch(String str,String rege) {

         Pattern pattern = Pattern.compile(rege);
         Matcher match = pattern.matcher(str);
         boolean matchs = match.matches();
         System.out.println(matchs);

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Pattern");
        // String rege=sc.nextLine();
        
        System.out.println("String");
        String str=sc.nextLine();
        
        regMatch(str, "[]");

        
    }
}
