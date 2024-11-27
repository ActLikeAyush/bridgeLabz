package BasicLogicalQuestions;

public class fibo {
    public static void main(String[] args) {
        int n=25;
        int count=2;
        int a=0;
        int b=1;
        while(count<n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

    }
}
