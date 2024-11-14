import java.util.Arrays;
/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={8,4,3,9,2,7,1,5};
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}