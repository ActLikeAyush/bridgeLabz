import java.util.Scanner;
class Operators{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);

        //  programs of arithmetic operators 

    System.out.println("Enter Value");
    int a=scan.nextInt();
    System.out.println("Enter Value");
    int b=scan.nextInt();
    System.out.println("Addition of two number is: "+(a+b));
    System.out.println(a>b?"a is greater then b ":"b is greater then a");
    System.out.println("table of a and b");
    for(int i=1;i<=10;i++){
        System.out.println(i*a+" "+i*b);
    }
    System.out.println("Enter Five numbers ");
    float x = scan.nextFloat();
    float y = scan.nextFloat();
    float z = scan.nextFloat();
    float p = scan.nextFloat();
    float q = scan.nextFloat();
    System.out.println("average of 5 number is "+((x+y+z+p+q)/5));
    System.out.println("Enter the radius of circle");
    float r=scan.nextFloat();
    System.out.println("Area of circle is: "+(3.14*r*r)+"\n"+"Circumference of circle is: "+(6.28*r));

        // programs of relational operators
    System.out.println("Enter 3 numbers to find the maximum number ");   
    float aa = scan.nextFloat();
    float bb = scan.nextFloat();
    float cc = scan.nextFloat(); 
    if(aa>=bb && aa>=cc){
        System.out.println("a is a maximum number");
    }
    else if(bb>=aa && bb>=cc){
        System.out.println("b is a maximum number");
    }
    else{
        System.out.println("c is a maximum number");
    }
    System.out.println("Enter String one and two");
    String str1=scan.next();
    String str2=scan.next();
    System.out.println((str1.equals(str2))?"both are equal":"both are not equal");
    System.out.println("Enter year ");
    int year=scan.nextInt();
    System.out.println((year%4==0 && year%100!=0)?"Enter year is leap year":"Enter year is not leap year");
    System.out.println("a program to demonstrate the difference between post-increment and pre-increment operators");
    int pre=4;
    ++pre;
    System.out.println("for demonstration of pre-increment i assign 4 and it is "+pre);
    int post=4;
    post++;
    System.out.println("for demonstration of post-increment i assign 4 and it is " + post);
    System.out.println("Enter any boolean value");
    boolean toggleNot=scan.nextBoolean();
    System.out.println((toggleNot==true)?(toggleNot=false):(toggleNot=true));
    System.out.println("bitwise wise operator \n Enter any two value");
    int test1=scan.nextInt();
    int tset2=scan.nextInt();
    System.out.println("when we apply & also known as AND: "+(test1 & tset2));
    System.out.println("when we apply | also known as OR: " + (test1 | tset2));
    System.out.println("when we apply ^ also known as XOR: " + (test1 ^ tset2));
    System.out.println("when we apply & also known as AND: " + (~ tset2));
    System.out.println("Enter any value ");
    int evOd=scan.nextInt();
    System.out.println(((evOd & 1)==1)?"number is Odd number":"number is even number");
    System.out.println("Enter the marks of Student ");
    int marks=scan.nextInt();
    System.out.println((marks<33)?"reattend the class":"student is promoted to next class");
    
    scan.close();

    }
}