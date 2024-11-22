package BasicLogicalQuestions;

import java.util.HashSet;

public class FindNnumbers {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,2,4,5,6,1,7,2};


        HashSet<Integer> arr1=new HashSet<>();
        for(int f=0;f<arr.length;f++){

        }


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("duplicate values");
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                index=i;
                System.out.println(arr[i]);
            }
        }
        System.out.println(index);

    }
}
