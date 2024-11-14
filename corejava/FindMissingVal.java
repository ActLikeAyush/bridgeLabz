import java.util.Scanner;

public class FindMissingVal {


    static int findMissingVal(int nums[]){
        int val=0;
        int mis=1;
        for(int j:nums){
            if(j==mis){
                mis++;
            }
            else{
                val=mis;
            }
        }       

        return val;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Lenght of Array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.err.println("Start Adding value to the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
            System.out.println(j);
        }
        System.out.println("sum "+FindMissingVal.findMissingVal(arr));
    }
    
}
