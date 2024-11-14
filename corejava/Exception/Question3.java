import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("Enter your age ");
            int age = sc.nextInt();
            checkAge(age);
        }
        catch(Exception E){
            System.out.println(E);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException, NegativeNumberException {
        if(age<0){
            throw new NegativeNumberException("Entered age is nagative please enter real age =>"+age);
        }
        else if(age<18){
            throw new InvalidAgeException(age+" years age is invalid minimum age is 18......");
        }
        else{
            System.out.println("you can vote ........");
        }
    }
}
