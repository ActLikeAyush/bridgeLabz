package BasicLogicalQuestions;

import java.util.Scanner;

public class OperatorsPrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        System.out.println("Enter any number");
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println("Enter any number for table");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i +" * "+table+" = "+table*i);
        }
        System.out.println("give any five values for average:  ");
        int f= sc.nextInt();
        int s= sc.nextInt();
        int t= sc.nextInt();
        int fr= sc.nextInt();
        int fi= sc.nextInt();
        int avg=f+s+t+fr+fi;
        avg=avg/5;
        System.out.println(avg);

//        area of circle=pi*r^2;
//         area and circumference of a circle = 2*pi*r


    }
}
