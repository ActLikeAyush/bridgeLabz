import java.util.Arrays;
import java.util.Scanner;
class Student{
    int rollNum;
    String name;
    int marks;
}
class SomeProlems{
    void solveAllOfThem(){
        Scanner scan = new Scanner(System.in);
        // Fibonacci serie s
        System.out.println("Enter the number up to which you need Fibonacci Series");
        int n = scan.nextInt();
        System.out.println("0 \n1");
        int fir = 0;
        int sec = 1;
        int next = 0;
        for (int i = 3; i < n; i++) {
            next = fir + sec;
            System.out.println(next);
            fir = sec;
            sec = next;

        }
        // Perfect number
        System.out.println("Enter any number to check is it perfect number or not:");
        int per = scan.nextInt();
        int div = 0;
        for (int ii = 1; ii < per; ii++) {
            if (per % ii == 0) {
                div = ii + div;
            }
        }
        System.out.println((per == div) ? "number is perfect number " : "number is not a perfect number");
        System.out.println("Enter the number to reverse  ");
        int rev = scan.nextInt();

        int reverse = 0;
        while (rev != 0) {
            int remn = rev % 10;
            reverse = reverse * 10 + remn;
            rev = rev / 10;

        }
        System.out.println(reverse);
        int N = 5;
        int turns = 0;
        int arrayCount = 0;
        int arr[] = new int[5];
        int index = 0;
        while (arrayCount < 5) {
            int ran = (int) (Math.random() * N);
            boolean isPresent = false;
            System.out.println("random" + ran);
            for (int i = 0; i < index; i++) {
                if (arr[i] == ran) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                arr[arrayCount] = ran;
                index++;
                arrayCount++;
                System.out.println("adding value " + ran);
            }
            turns++;

        }
        System.out.println(turns);
        System.out.println(Arrays.toString(arr));

        // prime number

        boolean Prime = true;
        System.out.println("Enter Number to Check Prime Number");
        int num = scan.nextInt();
        if (num <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        scan.close();

    }
}

class array{
    void allMethod(){
        int [] arr={8,9,7,5,0,6,3,1,2};
        System.out.println("before sorting: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("after sorting: "+Arrays.toString(arr));

        int key=41;
        int a=Arrays.binarySearch(arr, key);
        System.out.println("found at index no."+a);
    }
    void ticket(){
        int[] ticketVal = new int[5];
        int turns=0;
        int index=0;
        int n=0;
        while(index<5){
            System.out.println("1"+Arrays.toString(ticketVal));

            int rand=(int)(Math.random()*5);
            if(index<ticketVal.length){
                Arrays.sort(ticketVal);
                System.out.println("2"+Arrays.toString(ticketVal));
            }
            int sortIndex=Arrays.binarySearch(ticketVal, rand);
            if(sortIndex>0){
                ticketVal[index]=rand;
                index++;
                System.out.println("3"+Arrays.toString(ticketVal));
            }
            turns++;
            System.out.println("4"+Arrays.toString(ticketVal));

        }
    }
}

class jvmt{
    public static void main(String args[]){
        System.out.println("main method of jvmt class"+Arrays.toString(args));
    }
}

class Logical {

       public static void main(String[] args) {
        //    jvmt.main(new String[] { "a", "b", "c" });
        // if (args.length<5){
        //     args=new String[5];
        // }
        // args[0]="hy";
        // args[1]="this";
        // args[2]="is";
        // args[3]="me";
        // args[4]="ayush";
        
        // System.out.println(Arrays.toString(args));


        int array1[]=new int[5];int array2[]=new int[5];
        for(int i=0;i<array2.length;i++){
            array1[i]=i;
            array2[i] = i;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int arr[][]=new int[4][];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=j;
            }
        }
        System.out.println(Arrays.toString(arr));
    //    int []arr1={1,2,3,4,5};
    //    int[] arr2= { 1, 2, 3, 4, 5 };
    //    boolean a=Arrays.equals(arr1, arr2);
    //    System.out.println(a);
    //    Arrays.fill(arr1,2,4,231);
    //    System.out.println(Arrays.toString(arr1));


    //    int [] arr007=Arrays.copyOf(arr2, 8);
    //    System.out.println(Arrays.toString(arr007));



            




       } 
}
