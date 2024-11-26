package BasicLogicalQuestions;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Start entring values in array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your Array is");
        int sum=0;
        for(int i:arr){
            System.out.println(i);
            sum=sum+i;
        }
        BasicArray.Reverse(arr);
        int avg=sum/n;
        System.out.println("Sum of array Element is : "+sum+" \n average of array is: "+avg);
        BasicArray.arrSort(arr);
        System.out.println("minimum value of array is : "+arr[0]+"\n maximum value of array is : "+arr[n-1]);

    }

    private static void Reverse(int[] arr) {
        System.out.println("Reverse Array ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }

    private static int[] arrSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
