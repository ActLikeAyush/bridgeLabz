package BasicLogicalQuestions;

public class MatrixsAddition {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{5,4,3,2,1}};
        int arr1[][]={{1,2,3,4,5},{5,4,3,2,1}};
        int arr3[][]=new int[arr.length][arr[0].length];
        int arr4[][]=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                arr3[i][j]=arr[i][j]+arr1[i][j];

            }

        }


        for(int[] j:arr3){
            for(int k:j){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
