package BasicLogicalQuestions;

public class palindromeString {
    public static void main(String[] args) {
        String a="abcdcba";
        int start=0;
        int end=a.length()-1;
        boolean isPalindrome=true;
        while (start<end){
            if(a.charAt(start)!=a.charAt(end)){
                isPalindrome=false;
                break;
            }
            else{
                start++;
                end--;
            }
        }
        if(isPalindrome){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }
}
