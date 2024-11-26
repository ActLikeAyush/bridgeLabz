package BasicLogicalQuestions;

import java.util.HashSet;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int n=25;
        int totalRandomNumber=0;
        HashSet<Integer> set=new HashSet<>();
        while(set.size()<n){
            totalRandomNumber++;
            set.add(random.nextInt(n));
        }
        for(int i:set){
            System.out.println(i);
        }
        System.out.println("Total Random value generated : "+totalRandomNumber);
    }
}
