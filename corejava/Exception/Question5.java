import java.util.Scanner;

public class Question5 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        try{
            String str=sc.nextLine();
            int num=Integer.parseInt(str);
            
            num=100/num;
            
            
        }
        catch(NumberFormatException E){
            System.out.println(E);
        }
        catch(NullPointerException E){
            System.out.println(E);
        }
        catch(ArithmeticException E){
            System.out.println(E);
        }
    }

}
