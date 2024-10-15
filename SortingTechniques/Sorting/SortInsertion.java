

import java.util.Arrays;

public class SortInsertion {
   public static void main(String[] args) {
       int[] arr = { 5, 3, 6, 9, 4, 2, 1, 7 };
       int j = 0;
       int key=0;
       for(int i = 1; i < arr.length; i++) {
        j=i-1;
        key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;


            }
            arr[j+1]=key;
        

        }
        System.out.println(Arrays.toString(arr));
    }
}
    

