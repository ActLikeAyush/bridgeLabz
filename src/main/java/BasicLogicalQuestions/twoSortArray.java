package BasicLogicalQuestions;

import java.util.Arrays;

public class twoSortArray {
    public static int[] sort(int[] arr){
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

    public static int[] check(int []arr){
        int []arrr=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arrr[j++]=arr[i];
            }
            arrr[j++]=arr[arr.length-1];
        }
        return Arrays.copyOf(arrr, j);
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,2,4,9,7,8};
        int arr2[]={3,5,11,10,14,13};
        int l=arr1.length+arr2.length;
        sort(arr1);
        sort(arr2);
        int arr3[]=new int[l];
        int j=0;
        int k=0;

        for(int i=0;i<l;i++){
            if(i<arr1.length){
                arr3[j]=arr1[j];
                j++;
            }
            else{
                arr3[j]=arr2[k];
                j++;
                k++;
            }
        }
        check(arr3);
        for(int i:arr3){
            System.out.println(i);
        }
    }
}
