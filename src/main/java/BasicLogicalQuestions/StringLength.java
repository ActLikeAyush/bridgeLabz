package BasicLogicalQuestions;

public class StringLength {
    public static void main(String[] args) {
        String a="abcdefght";
        char []arr=a.toCharArray();
        int length=0;
        for(char l:arr){
            System.out.println(l);
            length++;
        }
        System.out.println(length);
    }
}
