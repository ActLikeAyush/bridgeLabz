import java.util.InputMismatchException;
import java.util.Scanner;

class Question1{
    static Scanner sc = new Scanner(System.in);
    public static void checkNum() {
        try {

            System.out.println("Enter any number :");
            int input = sc.nextInt();
            System.out.println(100/input);

        
        } catch (ArithmeticException E) {
            System.out.println("Please Enter non zero value .....");
            System.out.println(100/1);
            System.out.println(E);
           
        }
        catch(InputMismatchException E){
            System.out.println("you have Enter a non integer value.... ");
            System.out.println("Enter value like 1 :"+100/1);
            System.out.println(E);
        }
        
    }


   
    public static void main(String[] args) {
        
        checkNum();    
        
    }

    

    
}