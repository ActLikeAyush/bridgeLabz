package BasicLogicalQuestions;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
//        Leap Year Check
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year ");
        int y= sc.nextInt();
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
            System.out.println(y+" is a leap year");
        }
        else {
            System.out.println(y+" is not a leap year");
        }
        System.out.println("Enter check if a number is divisible by both 5 and 7.");
        int check= sc.nextInt();
        if(check%5==0 && check%7==0){
            System.out.println("it is divisible by both");
        }
        else {
            System.out.println("it is not divisible by both");
        }
    }
}
