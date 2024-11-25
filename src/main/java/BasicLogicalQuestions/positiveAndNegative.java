package BasicLogicalQuestions;

public class positiveAndNegative {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4, -6, 5};
        int n=arr.length;
        int []result=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int a:arr){
            if(a>=0&&posIndex<n){
                result[posIndex]=a;
                posIndex+=2;
            } else if (a < 0 && negIndex<n) {
                result[negIndex]=a;
                negIndex+=2;

            }
        }
        for(int a:result){
            System.out.println(a);
        }
    }
}
