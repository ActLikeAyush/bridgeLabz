package BasicLogicalQuestions;

public class DuplicateValuesInArray {
    public static void main(String[] args) {
        int arr[]={55,77,11,24,77,11,66,55,24,1,77,11,24,66,55};
        String reset = "\u001B[0m";  // Reset to default color
        String red = "\u001B[31m";   // Red text
        String green = "\u001B[32m"; // Green text
        String blue = "\u001B[34m";  // Blue text
        String yellow = "\u001B[33m"; // Yellow text
        int flag=0;
        for(int i=0;i<arr.length;i++){
            boolean Duplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    Duplicate=true;
                    break;
                }
            }
            if(Duplicate){
                System.out.println(yellow + arr[i]+" is a duplicate value "+reset);
            }
        }
    }
}
