import java.util.Scanner;

public class Search {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;

            }
        }
        return -1;
    }

    static int binarySearchRecursive(int arr[],int target,int left,int right){
        
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(mid<right){
                return binarySearchRecursive(arr, target, left, right);
            }
        }
       return -1; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        // int n=sc.nextInt();
        // int [] arr=new int [n];
        System.out.println("Enter Element in array");
        // for(int i=0;i<arr.length;i++){
            // arr[i]=sc.nextInt();
        // }
        System.out.println("Enter the value which you want to search");
        // int target=sc.nextInt();
        int arr[]={1,2,5,7,9,12,15,18};
        int target=5;
        // int result = linearSearch(arr, target);
        int result=binarySearch(arr,target);
        if(result!=-1){
            System.out.println("you value is in index of "+result);
        }
        else{
            System.out.println("value is not found");
        }
        
    }

}
