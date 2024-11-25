package BasicLogicalQuestions;

public class AssignmentAndUnary {
    public static void main(String[] args) {
//        Assignment Operators
//        1. Compound Assignment:
// ○ Write a program that demonstrates the use of all compound assignment
//        operators (+=,-=, *=, /=, %=).
        int i=0;
        int sum=5;
        sum +=2;
        System.out.println(sum);
        sum -=2;
        System.out.println(sum);
        sum *=2;
        System.out.println(sum);
        sum /=2;
        System.out.println(sum);
        sum %=2;
        System.out.println(sum);
//        Unary Operators- Any 1
//        1. Post-Increment and Pre-Increment:
        int countPost=0;
        countPost++;
        System.out.println(countPost);
        int CountPre=0;
        ++CountPre;
        ++CountPre;
        System.out.println(CountPre);
// ○ Write a program to demonstrate the difference between post-increment and
//        pre-increment operators.
//        2. Toggle Boolean:
// ○ Create a program that toggles a boolean variable using the logical NOT operator

        boolean flag=true;
        System.out.println("Initial value of flag is : "+flag);
        flag = !flag;
        System.out.println(flag);
        flag = !flag;
        System.out.println(flag);


//        Bitwise AND, OR, XOR:
//        ○ Write a program to demonstrate the use of bitwise AND, OR, and XOR operators
//        on two integers.
        int a=30;
        int b=14;
        int And=a & b;
        int OR=a | b;
        int Xor=a ^ b;
        System.out.println("And Result is : "+And+" for input a= "+a+" and b = "+b);
        System.out.println("OR Result is : "+OR+" for input a= "+a+" and b = "+b);
        System.out.println("Xor Result is : "+Xor+" for input a= "+a+" and b = "+b);

//        Bitwise Shifts:- Any 1
// ○ Write a program that multiplies a given integer by 2 using the left shift operator.
// ○ Create a program that divides a given integer by 2 using the right shift operator.

        int BitL=12;
        System.out.println(BitL<<1);
        int BitR=12;
        System.out.println(BitR>>1);

//        3. OddorEven:
// ○ Write a program that determines if a number is odd or even using the bitwise
//        ANDoperator.
        int num=14;
        if((num & 1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
//                Ternary Operator- Any 1
//        1. Min of Two Numbers:
// ○ Write a program to find the minimum of two numbers using the ternary operator.
        int a1=202;
        int a2=21;
        System.out.println(a1<a2 ? a2 : a1);


    }
}
