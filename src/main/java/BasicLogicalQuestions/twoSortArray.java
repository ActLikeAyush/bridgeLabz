package BasicLogicalQuestions;

public class twoSortArray {
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,2,4,9,7,8};
        int arr2[]={3,5,11,10,2,14,13};
        sort(arr1);
        sort(arr2);
        for(int i:arr1){
            System.out.println(i);
        }
        System.out.println("second array");
        for (int i:arr2){
            System.out.println(i);
        }

    }
}
