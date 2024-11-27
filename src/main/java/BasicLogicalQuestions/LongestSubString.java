package BasicLogicalQuestions;

public class LongestSubString {
    public static String sort(String a){
        char []arr=a.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String b=new String(arr);
        return b;
    }
    public static void main(String[] args) {
        String example="abcbcaacbcab";
        String newString="";
        String SortEx=LongestSubString.sort(example);
        for(int i=0;i<SortEx.length();i++){
            char current=SortEx.charAt(i);
            if(newString.contains(String.valueOf(current))){
//                 currentSubstring = currentSubstring.substring(currentSubstring.indexOf(currentChar) + 1);

            }

        }
        System.out.println(newString);


    }
}
