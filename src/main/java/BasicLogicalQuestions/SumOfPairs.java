package BasicLogicalQuestions;

public class SumOfPairs {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5};
        int target =6;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==6){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }

        }
    }
}
