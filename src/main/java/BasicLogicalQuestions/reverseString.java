package BasicLogicalQuestions;

public class reverseString {
    public static void main(String[] args) {
        String a="abcd";
        char[] arr=a.toCharArray();
        int n=arr.length;
        int l= arr.length;
        char[]arr1=new char[n];
        for(int i=0;i<n;i++){
            arr1[n-i-1]=arr[i];

        }
        String b=new String(arr1);
        System.out.println(b);
    }
}
