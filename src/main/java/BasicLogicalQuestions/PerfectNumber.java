package BasicLogicalQuestions;

public class PerfectNumber {
    public static void main(String[] args) {
        int a=28;
        int sum=0;
        boolean flag=false;
        for(int i=1;i<=28;i++){
            if(i%a==0) {

                sum = sum + i;
            }
        }
        if(sum==a){
            System.out.println(a+" is perfect number ");
        }
        else{
            System.out.println(a+" is not a perfect number ");
        }
    }
}
