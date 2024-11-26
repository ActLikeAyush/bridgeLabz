package BasicLogicalQuestions;

public class Reverse {
    public static void main(String[] args) {
        int val=345;
        int rev=0;
        
        while (val!=0){
            rev=rev*10;
            rev=rev+val%10;
            val=val/10;
        }
        System.out.println(rev);
    }
}
