package BasicLogicalQuestions;

public class countVowelsAndConsonant {
    public static void main(String[] args) {
        String a="itismeyours";
        char[] arr=a.toCharArray();
        int vowels=0;
        int consonant=0;
        for(char i:arr){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                vowels++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("vowels: "+vowels+" and consonants: "+consonant);
    }
}
