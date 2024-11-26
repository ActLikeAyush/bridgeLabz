package BasicLogicalQuestions;

import java.util.Arrays;

public class FindFrequencyOfArray {
    public static void main(String[] args) {

        int arr[]={55,77,11,24,77,11,66,55,24,77,11,24,66,55};
        String reset = "\u001B[0m";  // Reset
        String red = "\u001B[31m";   // Red
        String green = "\u001B[32m"; // Green
        String blue = "\u001B[34m";  // Blue
        String yellow = "\u001B[33m"; // Yellow

        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(flag==0 || flag!=arr[i]){
                flag=arr[i];
                int count=0;
                for(int j=0;j<arr.length;j++){
                    if(flag==arr[j]){
                        count++;
                    }
                }
                System.out.println(blue + flag + reset + red + " :- " + reset + yellow + count + reset);
            }
        }
    }
}
