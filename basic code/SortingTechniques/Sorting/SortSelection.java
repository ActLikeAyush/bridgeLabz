// package Sorting;

import java.util.Arrays;

/**
 * SortSelection
 */
public class SortSelection {
    static void myWay(int arr[]){
        int big = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            big = 0;
            for (int j = 0; j < i; j++) {

                if (arr[big] < arr[j + 1]) {
                    big = j + 1;
                }

            }
            int temp = arr[i];
            arr[i] = arr[big];
            arr[big] = temp;

        }
        System.out.println("my way"+Arrays.toString(arr));
    }

    static void ytWay(int arr[]){
        int min=-1;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("yt way outPut"+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        int []arr={5,3,6,9,4,2,1,7};
        SortSelection.myWay(arr);
        SortSelection.ytWay(arr);
        System.out.println(Arrays.toString(arr));
    }

}