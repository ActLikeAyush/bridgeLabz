package BasicLogicalQuestions;

import java.util.Arrays;

public class PositiveAndNegativeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,-2};
        int arr1[]=new int[arr.length];
        int positive=0;
        int negitve=1;
        for(int i:arr){
            if(i>0){
                arr1[positive]=i;
                positive+=2;
            }
            else{
                arr1[negitve]=i;
                negitve+=2;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
