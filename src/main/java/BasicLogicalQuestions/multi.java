package BasicLogicalQuestions;

public class multi {
    public static void main(String[] args){
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int arr1[][] = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int arr2[][] = new int[arr.length][arr1[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {

                System.out.print(arr2[i][j] +"   ");
            }
            System.out.println();
        }
    }
}
